package com.spark.etl.processor.common;

import org.apache.spark.SparkConf;
import org.apache.spark.sql.SparkSession;
import scala.collection.JavaConversions;

import java.util.Map;

public class SparkFactory {
    public static SparkSession createSparkSession(Map<String, String> options) {
        SparkSession.Builder builder = SparkSession.builder();
        SparkConf conf = new SparkConf();
        if (options == null || options.isEmpty()) {
            return builder
                    .appName("Spark ETL Tool")
                    .master("local[*]")
                    .getOrCreate();
        } else {
            conf.setAppName("Spark ETL Tool")
                    .setMaster("local[*]")
                    .setAll(JavaConversions.mapAsScalaMap(options));
        }

        return builder
                .config(conf)
                .getOrCreate();
    }
}
