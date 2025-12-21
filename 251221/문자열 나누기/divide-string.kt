import java.io.InputStreamReader
import java.io.BufferedReader

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    
    val n = br.readLine().toInt()
    val str = br.readLine().trim().replace(" ","")

    var cnt = 0
    for (i in 0 until str.length){
        if(cnt%5==0 && cnt != 0){
            println()
        }
        print(str[i].toString())
        cnt++
    }
}