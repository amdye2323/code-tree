fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    
    fun validate(num: Int): Boolean{
        val strList = num.toString().split("")
        if (num % 3 == 0) {
            return true
        }
        for (i in strList.indices){
            if (strList[i] == "3" || strList[i] == "6" || strList[i] == "9"){
                return true
            }
        }
        return false
    }
    var cnt = 0
    for (i in a .. b){
        if (validate(i)){
            cnt ++
        }
    }

    print(cnt.toString())
}