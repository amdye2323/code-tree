import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val list = Array(n){IntArray(m)}
    var num = 1
    for (d in 0 until n + m - 1) {
        for (i in 0 until n) {
            val j = d - i
            if (j in 0 until m) {
                list[i][j] = num++
            }
        }
    }

    list.forEach{row ->
        row.forEach{col ->
            print(col.toString() + " ")
         }
         println()
    }
}