package vn.bigdata.spark.etl.processor.entity;

public class ETLTransformConfig {
    String type;
    String condition;
    String column;
    String function;
    @Override
    public String toString() {
        return "ETLTransformConfig{" +
                "type='" + type + '\'' +
                ", condition='" + condition + '\'' +
                ", column='" + column + '\'' +
                ", function='" + function + '\'' +
                '}';
    }
}
