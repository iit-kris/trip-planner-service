package au.gov.nsw.transport.server.tp.controller;

/**
 * Created by AlbeusK on 26/07/2016.
 */
import au.gov.nsw.transport.server.tp.beans.TicketRetailer;
import au.gov.nsw.transport.server.tp.dto.TicketRetailerDto;
import au.gov.nsw.transport.server.tp.service.TicketService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.websocket.server.PathParam;
import java.util.List;


@RestController
@RequestMapping("/retailers")
public class TicketRetailerController {

    @Autowired
    private TicketService ticketService;

    @RequestMapping(method=RequestMethod.GET)
    public List<TicketRetailerDto> listAll() {
        return ticketService.list();
    }

    @RequestMapping(value="/postcode/{postcode}", method=RequestMethod.GET)
    public List<TicketRetailerDto> searchByPostCode(@PathVariable("postcode") String postcode) {
        return ticketService.searchByPostCode(postcode);
    }

    @RequestMapping(value="/address/{address}", method=RequestMethod.GET)
    public List<TicketRetailerDto> searchByAddress(@PathVariable("address") String address) {
        return ticketService.searchByAddress(address);
    }
}