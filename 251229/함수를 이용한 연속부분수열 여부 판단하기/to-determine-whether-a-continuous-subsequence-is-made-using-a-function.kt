fun main() {
    val (n1, n2) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }
    val b = readLine()!!.split(" ").map { it.toInt() }
    
    validate(a,b)
}

fun validate(aList: List<Int>,bList: List<Int>){
    var firstB = bList[0]
    var flag = false
    var cnt = 0
    for (i in aList.indices){
        if (aList[i] == firstB){
            
            for (j in bList){
                if (j == aList[i+cnt]){
                    cnt ++
                }else {
                    cnt = 0
                    break
                }
            }          
        }
    }
    if (cnt == bList.size){
        print("Yes")
    }else {
        print("No")
    }
}