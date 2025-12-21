import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    
    var total = 0
    var cnt = 0
    repeat(n){
        val str = br.readLine().toString().toCharArray()
        total += str.size
        if ('a'.equals(str[0])){
            cnt++
        }
    }
    print(total.toString() + " " + cnt.toString())
}