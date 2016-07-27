package au.gov.nsw.transport.server.tp.beans;

import java.math.BigDecimal;

/**
 * Created by AlbeusK on 27/07/2016.
 */
public class LatLng {

    private BigDecimal latitude, longitude;

    public LatLng(String latitude, String longitude) {
        this.latitude = new BigDecimal(latitude);
        this.longitude = new BigDecimal(longitude);
    }

    public LatLng(BigDecimal latitude, BigDecimal longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }
    public String toString() {
        return latitude + "," + longitude;
    }
}
