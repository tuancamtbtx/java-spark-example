package vn.bigdata.spark.etl.processor.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ETLJobConfig implements Serializable {
    ETLSparkConfig sparkConf;
    ETLSourceConfig sourceConf;
    ETLSinkConfig sinkConf;
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
