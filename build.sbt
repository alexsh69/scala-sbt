name := "scala-sbt"

version := "0.1"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq("org.slf4j" % "slf4j-api" % "1.7.9",
  "org.slf4j" % "slf4j-simple" % "1.7.9")

assemblyOutputPath in assembly := file("./out/fatJar.jar")