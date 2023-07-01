package com.spark.etl.processor.app;

import com.spark.etl.processor.common.SparkFactory;
import com.spark.etl.processor.entity.ETLConfig;
import org.apache.spark.sql.SparkSession;

import java.io.FileNotFoundException;

public class ETLProcessor extends ETLProcessAbstract {
    public static void main(String[] args) throws FileNotFoundException {
        SparkSession spark = SparkFactory.createSparkSession(null);
        run(spark, new ETLConfig().loadData());
    }
}
