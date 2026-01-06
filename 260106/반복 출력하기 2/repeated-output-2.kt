fun main() {
    val n = readLine()!!.toInt()
    
    reculsive(n)
}

fun reculsive(num: Int){
    if (num == 0){
        return 
    }
    reculsive(num -1)
    println("HelloWorld")
}