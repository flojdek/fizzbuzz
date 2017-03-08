name := "FizzBuzz"

version := "1.0"

scalaVersion := "2.11.8"

lazy val root = project in file(".")

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "3.0.1" % "test"
