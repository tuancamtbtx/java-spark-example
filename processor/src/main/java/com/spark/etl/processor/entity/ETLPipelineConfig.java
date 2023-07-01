package com.spark.etl.processor.entity;

import com.spark.etl.processor.app.ETLProcessor;
import org.apache.log4j.Logger;
import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.Map;

public class ETLPipelineConfig implements Serializable {
    private static final Logger LOGGER = Logger.getLogger(ETLProcessor.class);
    String version;
    ETLJobConfig job;
    public ETLPipelineConfig loadData() throws FileNotFoundException {
        Yaml yaml = new Yaml();
        InputStream inputStream = new FileInputStream(new File("/Users/tuan.nguyen3/Documents/Personal-Projects/spark-etl-tool/jobs_config/conf/test_etl.yaml"));
        Map<String, Object> data = yaml.load(inputStream);
        System.out.println(data);
        return this;
    }
}
