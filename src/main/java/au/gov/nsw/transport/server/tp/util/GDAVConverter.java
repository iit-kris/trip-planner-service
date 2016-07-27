package au.gov.nsw.transport.server.tp.util;

import au.gov.nsw.transport.server.tp.beans.LatLng;

import java.math.BigDecimal;

/**
 * Created by AlbeusK on 27/07/2016.
 */
public class GDAVConverter {

    private static double cLat0 = -33.88084567, cLong0 = 151.2165835;
    private static double cLat1 = -33.89454909, cLong1 = 151.1821976;
    private static double gLat0 = 3756950, gLong0 = 4890063;
    private static double gLat1 = 3758332, gLong1 = 4886814;

    private static double ratioLat = (gLat1 - gLat0) / (cLat1 - cLat0);
    private static double ratioLong = (gLong1 - gLong0) / (cLong1 - cLong0);

    public static LatLng latLngToGdav(LatLng latLng) {

        /*
        379 Bourke St, Darlinghurst
            "Latitude": "-33.88084567",
            "Longitude": "151.2165835",

            3756950,4890063

        197 King St, Newtown
            "Latitude": "-33.89454909",
            "Longitude": "151.1821976",
            3758332,4886814
         */

        double lat = (latLng.getLatitude().doubleValue() - cLat0) * ratioLat + gLat0;
        double lng = (latLng.getLongitude().doubleValue() - cLong0) * ratioLong + gLong0;

        return new LatLng(new BigDecimal(lat), new BigDecimal(lng));
    }

    public static void main(String args[]) {
        LatLng coord = new LatLng("-33.89454909", "151.1821976");
        System.out.println(latLngToGdav(coord));
    }
}
