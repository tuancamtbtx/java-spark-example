package com.spark.etl.processor.app;

import com.spark.etl.processor.entity.ETLPipelineConfig;
import org.apache.spark.sql.SparkSession;
import org.slf4j.Logger;
import scala.collection.immutable.Map;

import org.slf4j.LoggerFactory;

public abstract class ETLProcessAbstract {
    private static final Logger LOGGER = LoggerFactory.getLogger(ETLProcessAbstract.class);
    public static void run(SparkSession sparkSession, ETLPipelineConfig etlConfig) {
        Map<String, String> conf = sparkSession.conf().getAll();
        LOGGER.info("Spark Configuration: {} ",conf);
        sparkSession.close();
    }
}
