package com.test.spark

    //import org.apache.spark.sql.spark-csv
    import org.apache.spark.SparkContext
    import org.apache.spark.SparkConf
    //import org.apache.spark.sql.sqlContext
    import org.apache.spark.sql.SparkSession
object toronto {
  
    def main(){
      
      
      val conf = new SparkConf().setAppName("Toronto")
      val sc = new SparkContext(conf)
      val spark1 = SparkSession.builder().appName("Toronto").master("local").getOrCreate()
      
      val df = spark1.read.format("csv").option("header", "true").load("csv1.csv")

      df.withcolumn("Index",monotonically_increasing_id).filter("Index" > 5).drop("Index")
    
    
    }
}