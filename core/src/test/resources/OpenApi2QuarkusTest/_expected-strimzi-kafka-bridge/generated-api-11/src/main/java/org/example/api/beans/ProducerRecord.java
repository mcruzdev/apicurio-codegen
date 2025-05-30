
package org.example.api.beans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ProducerRecord
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "partition",
    "value",
    "key",
    "headers"
})
@Generated("jsonschema2pojo")
public class ProducerRecord {

    @JsonProperty("partition")
    private Integer partition;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    private Object value;
    @JsonProperty("key")
    private Object key;
    /**
     * KafkaHeaderList
     * <p>
     * 
     * 
     */
    @JsonProperty("headers")
    private List<KafkaHeader> headers = new ArrayList<KafkaHeader>();

    @JsonProperty("partition")
    public Integer getPartition() {
        return partition;
    }

    @JsonProperty("partition")
    public void setPartition(Integer partition) {
        this.partition = partition;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public Object getValue() {
        return value;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(Object value) {
        this.value = value;
    }

    @JsonProperty("key")
    public Object getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(Object key) {
        this.key = key;
    }

    /**
     * KafkaHeaderList
     * <p>
     * 
     * 
     */
    @JsonProperty("headers")
    public List<KafkaHeader> getHeaders() {
        return headers;
    }

    /**
     * KafkaHeaderList
     * <p>
     * 
     * 
     */
    @JsonProperty("headers")
    public void setHeaders(List<KafkaHeader> headers) {
        this.headers = headers;
    }

}
