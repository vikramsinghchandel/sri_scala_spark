package com.sri

import org.apache.spark.sql.SparkSession

object DriverMain {

  def main(args: Array[String]): Unit = {}

  val session = SparkSession.builder().appName("Sample Spark App")

  print("hello from spark sample app",session)

}
