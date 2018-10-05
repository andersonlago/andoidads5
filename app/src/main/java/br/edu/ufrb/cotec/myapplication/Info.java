package br.edu.ufrb.cotec.myapplication;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by anderson on 04/10/18.
 */
public class Info {

    private String seed;
    private Integer results;
    private Integer page;
    private String version;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getSeed() {
        return seed;
    }

    public void setSeed(String seed) {
        this.seed = seed;
    }

    public Integer getResults() {
        return results;
    }

    public void setResults(Integer results) {
        this.results = results;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
