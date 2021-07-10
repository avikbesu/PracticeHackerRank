// Problem: https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem
// Score: 30

object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/

        var phoneBook:Map[String,Int] = Map()
        val stdin = scala.io.StdIn

        val n = stdin.readLine.trim.toInt
        var i=0
        while(i<n){
            val arr = stdin.readLine.split(" ").map(_.trim.toString)
            phoneBook += ( arr(0) -> arr(1).toInt )
            i+=1
        }
        i=0
        while(i<n){
            val name = stdin.readLine.trim.toString
            if(phoneBook.contains(name)){
                println(name+"="+phoneBook(name))
            }else{
                println("Not found")
            }
            i+=1
        }

        
    }
}

