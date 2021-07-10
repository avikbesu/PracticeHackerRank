// Problem: https://www.hackerrank.com/challenges/30-2d-arrays/problem
// Score: 30

import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Solution {



    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val arr = Array.ofDim[Int](6, 6)
        var max = -100
        for (i <- 0 until 6) {
            arr(i) = stdin.readLine.split(" ").map(_.trim.toInt)
        }
        for(i <- 1 until 5;j <- 1 until 5){
            max=maxValue(max,hourglass(arr,i,j))
        }
        println(max)
    }

    def hourglass(arr:Array[Array[Int]] , xPos:Int , yPos:Int): Int = {
        var sum:Int=0

        for(i <- xPos-1 to xPos+1; j <- yPos-1 to yPos+1 ) {
            if(!(j!=yPos&&i==xPos)){
                sum = sum + arr(i)(j)
                //print(i + " " + j + ";")
            }
        }
        //println("")
        //println(xPos + " " + yPos + "->" + sum)
        sum
    }
    def maxValue(valA:Int,valB:Int):Int={
        if(valA>valB) valA
        else valB
    }
}
