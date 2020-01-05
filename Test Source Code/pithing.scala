package com.test.spark
    import org.apache.spark.SparkContext
    import org.apache.spark.SparkConf
    import java.io._
    object pithing {
  
    def main(args: Array[String]) {

          val conf = new SparkConf().setAppName("pithing")
    //create spark context object
    val sc = new SparkContext(conf)

val count = sc.parallelize(1 to 1000).filter { _ =>
  val x = math.random
  val y = math.random
  x*x + y*y < 1
}.count()
println(s"Pi is roughly ${4.0 * count / 1000}")
  val temporarything = (4 * count / 1000)
  val filename = new PrintWriter(new File("pi.txt"))
  filename.write("temporarything")

      
    }
    }