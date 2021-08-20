import java.util.Scanner
object Main {

    def main(args: Array[String]) {
        var s = new Scanner(System.in)
        var X = s.nextInt()
        var Y = s.nextInt()
        var troca = 0
        if(Y < X){
            troca = Y
            Y = X
            X = troca
        }
        var a = X + 1
        while(a<Y){
            if(a%5 == 2 || a%5 == 3){
                println(a)
            }
              a+=1
        }
        

    }

}