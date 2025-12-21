import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main(){
    class FastScanner {
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

    val nA = fs.nextInt()
    val nB = fs.nextInt()

    val aList = Array<Int>(nA){0}
    val bList = Array<Int>(nB){0}

    for (i in aList.indices){
        aList[i] = fs.nextInt()
    }

    for (i in bList.indices){
        bList[i] = fs.nextInt()
    }

    var flag = false
    val firstB = bList[0]
    
    for (i in 0 until nA){
        val iFlag = (nA - i) >= nB
        if (aList[i] == firstB && flag == false && iFlag){
            var cnt = 0
            for (j in 0 until nB){
                val bNum = bList[j]
                if (cnt < nB){
                    if (aList[i+j] == bList[j]){
                        cnt++
                        if (cnt == nB){
                            flag = true
                            break
                        }
                    }else {
                        break
                    }
                }else {
                    break
                }
            }
        }
    }

    if (flag){
        print("Yes")
    }else {
        print("No")
    }
}