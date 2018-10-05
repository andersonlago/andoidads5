package br.edu.ufrb.cotec.myapplication;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by anderson on 04/10/18.
 */
public class Coordinates {

    private String latitude;
    private String longitude;
    private Map <String, Object> additionalProperties = new HashMap <String, Object>();

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
