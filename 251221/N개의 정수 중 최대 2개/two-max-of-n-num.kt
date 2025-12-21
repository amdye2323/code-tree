import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main(){
    class FastScanner{
        private val br = BufferedReader(InputStreamReader(System.`in`))
        private var st: StringTokenizer? = null

        fun nextInt():Int {
            while(st == null || !st!!.hasMoreTokens()){
                st = StringTokenizer(br.readLine())
            }
            return st!!.nextToken().toInt()
        }
    }

    val fs = FastScanner()

    val n = fs.nextInt()
    val numList = Array<Int>(n){0}

    for(i in numList.indices){
        numList[i] = fs.nextInt()
    }
    
    numList.sortDescending()

    print(numList[0].toString() + " " + numList[1].toString())
}