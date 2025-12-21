import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    var cnt = 0
    val list = Array(n) {IntArray(m)}
    for (j in 0 until m){
        if (j % 2 == 0){
            for (i in 0 until n){
                list[i][j] = cnt++
            }
        } else{
            for (i in n-1 downTo 0){
                list[i][j] = cnt++
            }
        }
    }

    list.forEach{ it ->
        it.forEach{ num ->
            print(num.toString() + " ")
        }
        println()
    }
}