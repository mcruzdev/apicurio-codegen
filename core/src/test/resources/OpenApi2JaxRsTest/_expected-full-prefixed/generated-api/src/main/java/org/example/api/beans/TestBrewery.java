
package org.example.api.beans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Root Type for Brewery
 * <p>
 * The root of the Brewery type's schema.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "city",
    "state",
    "sampleBeers"
})
@Generated("jsonschema2pojo")
public class TestBrewery {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    /**
     *
     */
    @JsonProperty("sampleBeers")
    @JsonPropertyDescription("")
    private List<TestBeer> sampleBeers = new ArrayList<TestBeer>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     *
     */
    @JsonProperty("sampleBeers")
    public List<TestBeer> getSampleBeers() {
        return sampleBeers;
    }

    /**
     *
     */
    @JsonProperty("sampleBeers")
    public void setSampleBeers(List<TestBeer> sampleBeers) {
        this.sampleBeers = sampleBeers;
    }

}