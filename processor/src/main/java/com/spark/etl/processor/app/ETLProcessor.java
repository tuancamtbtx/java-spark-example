package com.spark.etl.processor.app;

import com.spark.etl.processor.common.SparkFactory;
import com.spark.etl.processor.entity.ETLPipelineConfig;
import org.apache.log4j.Logger;
import org.apache.spark.sql.SparkSession;

import java.io.FileNotFoundException;

public class ETLProcessor extends ETLProcessAbstract {
    private static final Logger LOGGER = Logger.getLogger(ETLProcessor.class);
    public static void main(String[] args) throws FileNotFoundException {
        LOGGER.info("Starting ETL Processor {}");
        SparkSession spark = SparkFactory.createSparkSession(null);
        run(spark, new ETLPipelineConfig().loadData());
    }
}
