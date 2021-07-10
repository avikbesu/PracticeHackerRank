// Problem: https://www.hackerrank.com/challenges/30-more-exceptions/problem
// Score: 30

import scala.util.control.Exception._

//Write your code here
class Calculator {
    def power(n : Int, p: Int): Int = {
        var cal = 1
        if(n < 0 || p < 0 ){
            throw new Exception("n and p should be non-negative")
        } 
            
        for (i <- 1 to p) {
            cal = cal * n
        }
        cal
    }

}

object Solution {

    def main(args: Array[String]) {
        var myCalculator=new Calculator();
        var T=scala.io.StdIn.readLine().toInt

        while(T>0){
            val Array(n,p) = scala.io.StdIn.readLine().split(" ").map(_.toInt);
            try{
                  var ans=myCalculator.power(n,p);
                  println(ans);
            }
            catch{
                case e: Exception => {
                    println(e.getMessage());
                }
            }
            T-=1;
        }
    }
}