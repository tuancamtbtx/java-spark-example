package vn.bigdata.spark.etl.processor.sql;

import com.google.inject.Inject;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.bigdata.spark.etl.processor.entity.ETLJobConfig;
import vn.bigdata.spark.etl.processor.entity.ETLPipelineConfig;
import vn.bigdata.spark.etl.processor.entity.ETLSinkConfig;
import vn.bigdata.spark.etl.processor.entity.ETLSourceConfig;

public class SparkPlaningContext {
    private static Logger LOGGER = LoggerFactory.getLogger(SparkPlaningContext.class);
    private static SparkPlaningContext instance = null;
    ETLJobConfig etlJobConfig;
    SparkSession spark;
    public SparkPlaningContext(SparkSession spark, ETLJobConfig etlJobConfig)    {
        this.etlJobConfig = etlJobConfig;
        this.spark = spark;
    }
    public Dataset<Row> loadDataset() {
        ETLSourceConfig sourceConf = this.etlJobConfig.getSourceConf();
        String format = sourceConf.getFormat();
        String path = sourceConf.getPath();
        if(format.equals("csv")) {
            return this.spark.read().format("csv").option("header", "true").load(path);
        }else if (format.equals("json")) {
            return this.spark.read().format("json").load(path);
        }else if (format.equals("parquet")) {
            return this.spark.read().format("parquet").load(path);
        }
        return null;
    }
    public Dataset<Row> transformDataset(Dataset<Row> ds) {
        return null;
    }
    public void sinkDataset(Dataset<Row> ds) {
        ETLSinkConfig sinkConf = this.etlJobConfig.getSinkConf();
    }

}
