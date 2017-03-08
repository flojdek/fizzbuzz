import com.typesane.fb._
import org.scalatest.FunSuite
import org.scalatest.Matchers._

class ReportTest extends FunSuite {

  test("illegal arguments") {
    an [IllegalArgumentException] should be thrownBy new Report(-1, 0, 0, 0, 0)
    an [IllegalArgumentException] should be thrownBy new Report(0, -1, 0, 0, 0)
    an [IllegalArgumentException] should be thrownBy new Report(0, 0, -1, 0, 0)
    an [IllegalArgumentException] should be thrownBy new Report(0, 0, 0, -1, 0)
    an [IllegalArgumentException] should be thrownBy new Report(0, 0, 0, 0, -1)
  }

  test("add ones") {
		val rep = Report(0, 0, 0, 0, 0)
		assert(rep.fizzAddOne == Report(1, 0, 0, 0, 0))
		assert(rep.buzzAddOne == Report(0, 1, 0, 0, 0))
		assert(rep.fizzbuzzAddOne == Report(0, 0, 1, 0, 0))
		assert(rep.luckyAddOne == Report(0, 0, 0, 1, 0))
		assert(rep.integerAddOne == Report(0, 0, 0, 0, 1))
  }

}
