package vn.bigdata.spark.etl.processor.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class ETLSparkConfig implements Serializable {
    String appName;
    String master;
    @Override
    public String toString() {
        return "ETLSparkConfig{" +
                "appName='" + appName + '\'' +
                ", master='" + master + '\'' +
                '}';
    }
}
