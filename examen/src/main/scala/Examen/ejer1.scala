package Examen

import org.apache.spark.sql.{DataFrame,SparkSession}

object ejer1 {
  def filterByColumnValue( df: DataFrame, column: String, value: String): DataFrame ={
    df.filter(df(column) === value)
  }

}
