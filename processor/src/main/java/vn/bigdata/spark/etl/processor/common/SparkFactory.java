package vn.bigdata.spark.etl.processor.common;

import org.apache.spark.SparkConf;
import org.apache.spark.sql.SparkSession;
import scala.collection.JavaConversions;
import vn.bigdata.spark.etl.processor.entity.ETLPipelineConfig;
import vn.bigdata.spark.etl.processor.entity.ETLSparkConfig;

import java.util.Map;

public class SparkFactory {
    public static SparkSession createSparkSession(ETLPipelineConfig etlConf) {
        SparkSession.Builder builder = SparkSession.builder();
        SparkConf conf = new SparkConf();
        ETLSparkConfig sparkConf = etlConf.getJob().getSparkConf();
        String jobName = sparkConf.getAppName();
        String master = sparkConf.getMaster();
        Map<String, String> options = sparkConf.getConf();
        if (options == null || options.isEmpty()) {
            return builder
                    .appName("Spark ETL Tool")
                    .master("local[*]")
                    .getOrCreate();
        } else {
            conf.setAppName(jobName)
                    .setMaster(master)
                    .setAll(JavaConversions.mapAsScalaMap(options));
        }
        return builder
                .config(conf)
                .getOrCreate();
    }
}
