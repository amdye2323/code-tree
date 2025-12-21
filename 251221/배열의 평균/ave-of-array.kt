import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`)) 
    val numList = Array<IntArray>(2){ IntArray(4) }

    var total = 0

    for(i in numList.indices){
        val st = StringTokenizer(br.readLine())
        for (j in numList[i].indices){
            val num = st.nextToken().toInt()
            numList[i][j] = num
            total += num
        }
    }
    
    

     for (i in numList.indices){
        var wid = 0
        for (j in numList[i].indices){
            wid += numList[i][j]
        }
        val widAvg:Double = (wid.toDouble() / 4)
        print(String.format("%.1f",widAvg) + " ")
    }

    println()

    for (j in 0 until 4){
        var leg = 0
        for (i in numList.indices){
            leg += numList[i][j]
        }
        val widLeg:Double = (leg.toDouble() / 2)
        print(String.format("%.1f",widLeg) + " ")
    }

    println()
    val totalAvg = total.toDouble() / 8

    print(String.format("%.1f",totalAvg))
}