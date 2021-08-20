
import java.util.Scanner
object Main {

    def main(args: Array[String]) {
        var i = 0
        var cont = 0
        var n = 0
        var s = new Scanner(System.in)
        while(i<5){
            n = s.nextInt()
            if(n%2==0){
                cont += 1
            }
            i+=1
    }
    println(cont +" valores pares")

    }

}