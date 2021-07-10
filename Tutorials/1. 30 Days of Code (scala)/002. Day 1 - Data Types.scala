// Problem: https://www.hackerrank.com/challenges/30-data-types/problem
// Score: 30

object Solution {
    def main(args: Array[String]) {
        val i = 4
        val d = 4.0
        val s = "HackerRank "

		// Read values of another integer, double, and string variables
        // Note use scala.io.StdIn to read from stdin

        val stdin = scala.io.StdIn

        val ii = stdin.readLine.trim.toInt
        val dd = stdin.readLine.trim.toDouble
        val ss = stdin.readLine.trim.toString
        
        // Print the sum of both the integer variables

        println(i + ii)
        
        // Print the sum of both the double variables
        println(d + dd)
        
        // Concatenate and print the string variables
        // The 's' variable above should be printed first.
        println(s + ss)
    }
}