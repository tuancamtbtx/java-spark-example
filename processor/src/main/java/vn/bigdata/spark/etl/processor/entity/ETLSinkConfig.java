package vn.bigdata.spark.etl.processor.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class ETLSinkConfig implements Serializable {
    String connection;
    String format;

    @Override
    public String toString() {
        return "ETLSinkConfig{" +
                "connection='" + connection + '\'' +
                ", format='" + format + '\'' +
                '}';
    }
}
