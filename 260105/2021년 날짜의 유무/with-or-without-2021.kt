import java.io.InputStreamReader
import java.io.BufferedReader
import java.util.StringTokenizer

fun main() {
    val (m, d) = readln().split(" ").map { it.toInt() }
    var flag = false
    for (i in 1 .. 12){
        if (i == m){
            var maxDay = 30


            if (i == 2){ // 2월?
                maxDay = 28
            }else if (i % 2 == 1 && i <= 7){
                maxDay = 31
            }else if (i % 2 == 0 && i >= 8){
                maxDay = 31
            }

            for (j in 1 .. maxDay){
                if (j == d){
                    flag = true
                }
            }
        }
    }

    if (flag == true){
        print("Yes")
    }else {
        print("No")
    }
}