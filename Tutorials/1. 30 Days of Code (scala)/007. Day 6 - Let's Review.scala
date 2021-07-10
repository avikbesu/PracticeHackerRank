// Problem: https://www.hackerrank.com/challenges/30-review-loop/problem
// Score: 30

object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/

        var T=scala.io.StdIn.readInt()
        var i=0
        for(i<-1 to T){        
             var str=scala.io.StdIn.readLine.trim.toString
             calculate(str)
        }
    }
    def calculate(str:String){
        var odd = ""
        var even =""
        for(i <- 0 to str.length-1){
            if(i%2==0){
                odd = odd + str(i)
            } else {
                even = even + str(i)
            }
        }
        println(odd + " " + even)
    }
}

