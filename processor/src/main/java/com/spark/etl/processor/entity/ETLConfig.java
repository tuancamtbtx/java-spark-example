package com.spark.etl.processor.entity;

import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.Map;

public class ETLConfig implements Serializable {
    String name;
    public ETLConfig loadData() throws FileNotFoundException {
        Yaml yaml = new Yaml();
        InputStream inputStream = new FileInputStream(new File("/Users/tuan.nguyen3/Documents/Personal-Projects/spark-etl-tool/intergration/conf/test_etl.yaml"));
        Map<String, Object> data = yaml.load(inputStream);
        return this;
    }
}
