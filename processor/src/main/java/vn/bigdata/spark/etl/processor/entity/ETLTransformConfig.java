package vn.bigdata.spark.etl.processor.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ETLTransformConfig {
    @JsonProperty
    String type;
    @JsonProperty
    String condition;
    @JsonProperty
    List<String> columns;
    @JsonProperty
    String function;
    @Override
    public String toString() {
        return "ETLTransformConfig{" +
                "type='" + type + '\'' +
                ", condition='" + condition + '\'' +
                ", column='" + columns + '\'' +
                ", function='" + function + '\'' +
                '}';
    }
}
