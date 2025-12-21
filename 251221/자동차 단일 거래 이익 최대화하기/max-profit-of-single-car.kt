import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main(){
    class FastScanner {
        private val br = BufferedReader(InputStreamReader(System.`in`))
        private var st: StringTokenizer? = null

        fun getInt():Int {
            while(st == null || !st!!.hasMoreTokens()){
                st = StringTokenizer(readLine())
            }
            return st!!.nextToken().toInt()
        }
    }

        val fs = FastScanner()
        val n = fs.getInt()

        var minNum = 999999
        var maxBenefit = 0

        for(i in 0 until n){
            val num = fs.getInt()

            if (i == 0){
                minNum = num
            }

            if (num<minNum){
                minNum = num
            }

            val benefit = num - minNum
            
            if(benefit > maxBenefit) {
                maxBenefit = benefit
            }
        }
        print(maxBenefit.toString())
            
}