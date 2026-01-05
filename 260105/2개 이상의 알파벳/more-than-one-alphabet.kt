fun main() {
    val a: String = readLine()!!
    
    val aList = a.split("").filter { it.isNotEmpty() }

    val firstStr = aList[0]
    var isFlag = false
    for (i in 1 until aList.size){
        if (!firstStr.equals(aList[i])){
            isFlag = true
        }
    }
    if (isFlag){print("Yes")} else {print("No")}
}