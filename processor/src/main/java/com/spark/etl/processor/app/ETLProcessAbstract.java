package com.spark.etl.processor.app;

import com.spark.etl.processor.entity.ETLConfig;
import org.apache.spark.sql.SparkSession;

public abstract class ETLProcessAbstract {
    public static void run(SparkSession sparkSession, ETLConfig etlConfig) {
        System.out.println("Hello World!");
    }
}
