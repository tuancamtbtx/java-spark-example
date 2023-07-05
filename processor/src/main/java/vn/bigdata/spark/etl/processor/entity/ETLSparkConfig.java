package vn.bigdata.spark.etl.processor.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class ETLSparkConfig implements Serializable {
    @JsonProperty
    String appName;
    @JsonProperty
    String master;
    @Override
    public String toString() {
        return "ETLSparkConfig{" +
                "appName='" + appName + '\'' +
                ", master='" + master + '\'' +
                '}';
    }
}
