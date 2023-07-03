package com.spark.etl.processor.app;

import com.spark.etl.core.util.EnvUtil;
import com.spark.etl.core.util.StringUtil;
import com.spark.etl.processor.common.SparkFactory;
import com.spark.etl.processor.entity.ETLPipelineConfig;
import org.apache.log4j.Logger;
import org.apache.spark.sql.SparkSession;

import java.io.FileNotFoundException;

public class ETLProcessor extends ETLProcessAbstract {
    private static final Logger LOGGER = Logger.getLogger(ETLProcessor.class);
    public static void main(String[] args) throws FileNotFoundException {
        LOGGER.info("Starting ETL Processor {}");
        String fileConf = EnvUtil.getEnv("ETL_CONF_FILE", "/Users/tuan.nguyen3/Documents/Personal-Projects/spark-etl-tool/jobs_config/conf/test_etl.yaml");
        if(StringUtil.isEmpty(fileConf)) {
            LOGGER.error("ETL_CONF_FILE is not set");
            System.exit(1);
        }
        SparkSession spark = SparkFactory.createSparkSession(null);
        run(spark, new ETLPipelineConfig().loadData(fileConf));
    }
}
