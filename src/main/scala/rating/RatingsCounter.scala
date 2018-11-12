package rating

import org.apache.spark.{SparkConf, SparkContext}

object RatingsCounter extends App{

  // Create a SparkContext using every core of the local machine, named RatingsCounter
  val conf = new SparkConf().setAppName("RatingCounter").setMaster("local[*]")
  val sc = new SparkContext(conf)

  // Load up each line of the ratings data into an RDD
  val lines = sc.textFile("ratings.dat")

  /**
    * Convert each line to a string, split it out by tabs, and extract the third field.
    * (The file format is userID, movieID, rating, timestamp)
    */
  val ratings = lines.map(x => x.toString.split("::")(2))

  // Count up how many times each value (rating) occurs
  val results = ratings.countByValue()

  // Sort the resulting map of (rating, count) tuples
  val sortResults = results.toSeq.sortBy(_._1)

  // Print each result on its own line.
  sortResults.foreach(println)

}
