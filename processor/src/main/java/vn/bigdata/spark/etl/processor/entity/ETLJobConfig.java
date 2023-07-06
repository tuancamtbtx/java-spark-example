package vn.bigdata.spark.etl.processor.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Data
@Getter
@Setter
public class ETLJobConfig implements Serializable {
    @JsonProperty
    ETLSparkConfig sparkConf;
    @JsonProperty
    ETLSourceConfig sourceConf;
    @JsonProperty
    ETLSinkConfig sinkConf;
    @JsonProperty
    List<ETLTransformConfig> transformConf;

    @Override
    public String toString() {
        return "ETLJobConfig{" +
                "sparkConf=" + sparkConf +
                ", sourceConf=" + sourceConf +
                ", sinkConf=" + sinkConf +
                ", transformConf=" + transformConf +
                '}';
    }
}
