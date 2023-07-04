package vn.bigdata.spark.etl.processor.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import vn.bigdata.spark.etl.processor.app.ETLProcessor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yaml.snakeyaml.Yaml;

import java.io.*;

@Data
@Getter
@Setter
public class ETLPipelineConfig implements Serializable {
    private static final Logger LOGGER = LoggerFactory.getLogger(ETLProcessor.class);
    @JsonProperty("version")
    String version;
    @JsonProperty("job")
    ETLJobConfig job;

    public void setVersion(String version) {
        this.version = version;
    }
    public void setETLJobConfig(ETLJobConfig job) {
        this.job = job;
    }
    public String toString() {
        return "ETLPipelineConfig{" +
                "version='" + version + '\'' +
                ", job=" + job +
                '}';
    }
    public ETLPipelineConfig loadData(String fileConf) throws IOException {
        Yaml yaml = new Yaml();
        InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream(fileConf);
//        Yaml yaml = new Yaml(new Constructor(ETLPipelineConfig.class));
        ETLPipelineConfig etlConf = yaml.load(inputStream);
        LOGGER.info("ETL Pipeline Config: {}", etlConf);
        return this;
    }
}
