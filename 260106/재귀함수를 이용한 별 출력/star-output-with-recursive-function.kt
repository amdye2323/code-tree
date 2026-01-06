fun main() {
    val n = readLine()!!.toInt()
    
    // Please write your code here.
    reculsive(n)
}

fun reculsive(num: Int){
    if (num == 0){
        return
    }
    reculsive(num -1)
    for (i in 0 until num){
        print("*")
    }
    println("")
}