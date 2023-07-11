package vn.bigdata.spark.etl.processor.app;

import vn.bigdata.spark.etl.processor.entity.ETLJobConfig;
import vn.bigdata.spark.etl.processor.entity.ETLPipelineConfig;
import org.apache.spark.sql.SparkSession;
import org.slf4j.Logger;
import scala.collection.immutable.Map;

import org.slf4j.LoggerFactory;
import vn.bigdata.spark.etl.processor.sql.SparkPlaningContext;

public abstract class ETLProcessAbstract {
    private static final Logger LOGGER = LoggerFactory.getLogger(ETLProcessAbstract.class);
    public static void run(SparkSession sparkSession, ETLPipelineConfig etlConfig) {
        ETLJobConfig job = etlConfig.getJob();
        SparkPlaningContext context = new SparkPlaningContext(sparkSession, job);
        context.loadDataset();
        Map<String, String> conf = sparkSession.conf().getAll();
        LOGGER.info("Spark Configuration: {} ",conf);
        sparkSession.close();
    }
}
