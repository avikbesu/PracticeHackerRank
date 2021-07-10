// Problem: https://www.hackerrank.com/challenges/30-binary-numbers/problem
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

        var n = stdin.readLine.trim.toInt
        var cur_occurance =0
        var max_occurance =0
        while(n>0){
            val reminder = n%2
            n=n/2
            if(reminder==1){
                cur_occurance += 1
                if(cur_occurance>max_occurance) max_occurance=cur_occurance
            }else{
                cur_occurance=0
            }
        }
        println(max_occurance)

    }
}
