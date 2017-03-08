package com.typesane.fb

case class Report(fizz: Int, buzz: Int, fizzbuzz: Int, lucky: Int, integer: Int) {

	require(fizz >= 0 && buzz >= 0 && fizzbuzz >= 0 && lucky >= 0 && integer >= 0)

	override def toString = s"fizz: $fizz buzz: $buzz fizzbuzz: $fizzbuzz lucky: $lucky integer: $integer"

	def fizzAddOne = this.copy(fizz = this.fizz + 1)
	def buzzAddOne = this.copy(buzz = this.buzz + 1)
	def fizzbuzzAddOne = this.copy(fizzbuzz = this.fizzbuzz + 1)
	def luckyAddOne = this.copy(lucky = this.lucky + 1)
	def integerAddOne = this.copy(integer = this.integer + 1)

}
