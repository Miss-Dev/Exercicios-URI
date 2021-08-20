import java.util.Scanner
object Main {

    def main(args: Array[String]) {

        var s = new Scanner(System.in)
        var X = s.nextInt()
        if(X>=1 && X<=1000){
            var i = 1    
            while(i <= X){
                if(i%2!=0){      
          
                    println(i)
                }
                i+=1
            }
        }
    

    }

}