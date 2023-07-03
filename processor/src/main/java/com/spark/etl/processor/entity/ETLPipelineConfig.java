package com.spark.etl.processor.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spark.etl.processor.app.ETLProcessor;
import org.apache.log4j.Logger;
import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.Map;

public class ETLPipelineConfig implements Serializable {
    private static final Logger LOGGER = Logger.getLogger(ETLProcessor.class);
    @JsonProperty("version")
    String version;
    @JsonProperty("job")
    ETLJobConfig job;

    public ETLPipelineConfig loadData(String fileConf) throws FileNotFoundException {
        Yaml yaml = new Yaml();
        InputStream inputStream = new FileInputStream(new File(fileConf));
        Map<String, Object> data = yaml.load(inputStream);
        System.out.println(data);
        return this;
    }
}
