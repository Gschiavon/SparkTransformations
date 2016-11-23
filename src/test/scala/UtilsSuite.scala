import org.apache.spark.sql.Row
import org.scalatest.FunSuite
import com.datio.streaming.Commons.Commons._
class UtilsSuite extends FunSuite {

  test(s"parseJson -> with 2 fields ") {
    val json = """{"firstName": "144444", "lastName": "2",  "surName": "5"}"""
    assert(parseJSONField(json) == List("144444", "2", "5"))
  }

  test("toRow -> List(14,23,56)"){
    assert(toRow(List("14", "23", "56")) == Row("14", "23", "56"))
  }


}
