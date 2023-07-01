package com.spark.etl.processor.app;

import com.spark.etl.processor.entity.ETLPipelineConfig;
import org.apache.spark.sql.SparkSession;

public abstract class ETLProcessAbstract {
    public static void run(SparkSession sparkSession, ETLPipelineConfig etlConfig) {
        System.out.println("Hello World!");
    }
}
