import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main(){
    class FastSacnner{
        private val br = BufferedReader(InputStreamReader(System.`in`))
        private var st: StringTokenizer? = null
        
        fun nextInt(): Int{
            while(st == null || !st!!.hasMoreTokens()){
                st = StringTokenizer(br.readLine())
            }
            return st!!.nextToken().toInt()
        }
    }

    val fs = FastSacnner()
    val n = fs.nextInt()
    val q = fs.nextInt()

    val numList = Array<Int>(n) {0}
    for (i in 0 until n){
        numList[i] = fs.nextInt()
    }

    repeat(q){
        val branch = fs.nextInt()

        if (branch == 1){
            val idx = fs.nextInt()
            println(numList[idx-1])
        }else if (branch == 2){
            val searchNum = fs.nextInt()
            var cnt = 0 
            var flag = false
            for (num in numList){
                cnt ++
                if (num == searchNum){
                    flag = true
                    break
                }
            }
            if (flag == true){
                println(cnt.toString())
            }else {
                println("0")
            }
            
        }else {
            val start = fs.nextInt()
            val end = fs.nextInt()
            for (i in start .. end){
                print(numList[i-1].toString()+" ")
            }
            println()
        }
    }
}