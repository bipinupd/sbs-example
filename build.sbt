name := "sbs-example"
version := "1.0"
scalaVersion := "2.12.1"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
resolvers += Resolver.mavenLocal

libraryDependencies += "org.scalatest" % "scalatest_2.12" % "3.0.4" % "test"

fork in run := true
