package au.gov.nsw.transport.server.tp.service;

import au.gov.nsw.transport.server.tp.beans.LatLng;
import au.gov.nsw.transport.server.tp.beans.TicketRetailer;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import au.gov.nsw.transport.server.tp.dto.TicketRetailerDto;
import au.gov.nsw.transport.server.tp.util.GDAVConverter;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class TicketService {

    private List<TicketRetailerDto> ticketRetailerList;

    public TicketService() {
        ticketRetailerList = new ArrayList<TicketRetailerDto>();
    }

    @PostConstruct
    public void init() {
        try {
            Reader reader = new InputStreamReader(TicketService.class.getResourceAsStream("/ticket-retailer.json"), "UTF-8");
            ObjectMapper om = new ObjectMapper();
            TicketRetailer[] list = om.readValue(reader, TicketRetailer[].class);

            for(TicketRetailer retailer : list) {
                TicketRetailerDto dto = new TicketRetailerDto();
                BeanUtils.copyProperties(retailer, dto);

                LatLng coord = new LatLng(retailer.getLatitude(), retailer.getLongitude());
                LatLng gdavCoord = GDAVConverter.latLngToGdav(coord);

                dto.setLatitude(String.valueOf(gdavCoord.getLatitude().intValue()));
                dto.setLongitude(String.valueOf(gdavCoord.getLongitude().intValue()));

                ticketRetailerList.add(dto);
            }

        } catch(IOException uee) {
            uee.printStackTrace();
        }
    }


    public List<TicketRetailerDto> list() {
        return ticketRetailerList;
    }

    public List<TicketRetailerDto> searchByPostCode(final String postcode) {
        return ticketRetailerList.stream().filter(
                retailer ->
                retailer.getPostcode() != null && retailer.getPostcode().equals(postcode))
                .collect(Collectors.toList());
    }

    public List<TicketRetailerDto> searchByAddress(final String address) {
        return ticketRetailerList.stream().filter(
                retailer ->
                        retailer.getAddress() != null && retailer.getAddress().toUpperCase().contains(address.toUpperCase()))
                .collect(Collectors.toList());
    }
}