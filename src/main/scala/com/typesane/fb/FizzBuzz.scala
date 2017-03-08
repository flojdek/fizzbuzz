package com.typesane.fb

import scala.language.postfixOps

case object FizzBuzz {

	def numHasDigit3(x: Int) = x.toString.toList.contains('3')

}

case class FizzBuzz(rangeStart: Int, rangeEnd: Int) {

	import FizzBuzz._

	require(rangeEnd >= rangeStart)

	override def toString = {

		val initialAcc = (List.empty[String], Report(0, 0, 0, 0, 0))

		val (finalLst, finalRep) = (rangeStart to rangeEnd).foldRight(initialAcc) { case (num, (lst, rep)) =>

				// Calculate new state.
				val (newElm, newRep) = 
					if (numHasDigit3(num)) ("lucky", rep.luckyAddOne)
					else if (num % 15 == 0) ("fizzbuzz", rep.fizzbuzzAddOne)
					else if (num % 3 == 0) ("fizz", rep.fizzAddOne)
					else if (num % 5 == 0) ("buzz", rep.buzzAddOne)
					else (num.toString, rep.integerAddOne)

				// Return new state.
				(newElm :: lst, newRep) 

		}

		// Assemble final string.
		val finalLstStr = finalLst.mkString(" ")
		(if (finalLstStr.nonEmpty) s"$finalLstStr " else "") + finalRep	

	}

	def printFizzBuzz: Unit = println toString

}
