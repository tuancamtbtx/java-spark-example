package com.spark.etl.processor.entity;

import java.io.Serializable;

public class ETLSourceConfig implements Serializable {
    String format;
    String path;
    String schema;
}
