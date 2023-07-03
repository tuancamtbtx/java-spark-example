package com.spark.etl.processor.app;

import com.spark.etl.processor.entity.ETLPipelineConfig;
import org.apache.log4j.Logger;
import org.apache.spark.sql.SparkSession;
import scala.collection.immutable.Map;

public abstract class ETLProcessAbstract {
    private static final Logger LOGGER = Logger.getLogger(ETLProcessAbstract.class);
    public static void run(SparkSession sparkSession, ETLPipelineConfig etlConfig) {
        Map<String, String> conf = sparkSession.conf().getAll();
        LOGGER.info("Spark Configuration: " + conf);
        sparkSession.close();
    }
}
