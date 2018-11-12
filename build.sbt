name := "RatingsCounter"

version := "0.1"

scalaVersion := "2.11.12"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.2.2"
libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.2.2"
libraryDependencies += "org.apache.spark" %% "spark-streaming-twitter" % "1.6.3"
libraryDependencies += "org.apache.logging.log4j" % "log4j-core" % "2.10.0"
libraryDependencies += "org.apache.bahir" %% "spark-streaming-twitter" % "2.2.1"