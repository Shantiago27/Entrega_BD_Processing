package Examen

import org.apache.spark.sql.{DataFrame,SparkSession}
import utils.TestInit

class ejer1Test extends TestInit {

  "filterByColumnValue" should "filter rows correctly" in {
  val inputData = Seq(
    ("John", "Developer"),
    ("Alice", "Data Scientist"),
    ("Bob", "Developer")
  )

  val inputDf: DataFrame =spark.createDataFrame(inputData).toDF("name","profession")

  val resultDf = ejer1.filterByColumnValue(inputDf,"profession","Developer")

    resultDf.show()
    assert(resultDf.count() == 2)
    assert(resultDf.collect().map(_.getString(0)).contains("John"))
  }
}
