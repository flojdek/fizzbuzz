import com.typesane.fb._
import org.scalatest.FunSuite
import org.scalatest.Matchers._

class FizzBuzzTest extends FunSuite {

	test("utils has digit 3") {
		assert(FizzBuzz.numHasDigit3(0) == false)
		assert(FizzBuzz.numHasDigit3(3) == true)
		assert(FizzBuzz.numHasDigit3(1220980) == false)
		assert(FizzBuzz.numHasDigit3(980234980) == true)
	}

  test("illegal arguments") {
    an [IllegalArgumentException] should be thrownBy new FizzBuzz(1, 0)
  }

  test("rangeStart == rangeStop") {
		assert(FizzBuzz(0, 0).toString == "fizzbuzz fizz: 0 buzz: 0 fizzbuzz: 1 lucky: 0 integer: 0")
		assert(FizzBuzz(1, 1).toString == "1 fizz: 0 buzz: 0 fizzbuzz: 0 lucky: 0 integer: 1")
		assert(FizzBuzz(3, 3).toString == "lucky fizz: 0 buzz: 0 fizzbuzz: 0 lucky: 1 integer: 0")
		assert(FizzBuzz(5, 5).toString == "buzz fizz: 0 buzz: 1 fizzbuzz: 0 lucky: 0 integer: 0")
		assert(FizzBuzz(13, 13).toString == "lucky fizz: 0 buzz: 0 fizzbuzz: 0 lucky: 1 integer: 0")
		assert(FizzBuzz(15, 15).toString == "fizzbuzz fizz: 0 buzz: 0 fizzbuzz: 1 lucky: 0 integer: 0")
  }

	test("rangeStart < rangeStop - minimal") {
		assert(FizzBuzz(-6, 0).toString == "fizz buzz -4 lucky -2 -1 fizzbuzz fizz: 1 buzz: 1 fizzbuzz: 1 lucky: 1 integer: 3")
	}

	test("rangeStart < rangeStop - bigger") {
		assert(FizzBuzz(1, 20).toString == "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz " + 
			"fizz: 4 buzz: 3 fizzbuzz: 1 lucky: 2 integer: 10")
	}

}
