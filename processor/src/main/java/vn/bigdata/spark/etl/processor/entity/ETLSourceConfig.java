package vn.bigdata.spark.etl.processor.entity;

import java.io.Serializable;

public class ETLSourceConfig implements Serializable {
    String format;
    String path;
    String schema;

    @Override
    public String toString() {
        return "ETLSourceConfig{" +
                "format='" + format + '\'' +
                ", path='" + path + '\'' +
                ", schema='" + schema + '\'' +
                '}';
    }
}
