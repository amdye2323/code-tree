fun main() {
    val n = readLine()!!.toInt()
    // Please write your code here.
    print(reculsive(n).toString())
}

fun reculsive(num: Int):Int {
    if (num < 1){
        return num
    }
    val result = reculsive(num/10)
    // println((num % 10).toString()+" + " + (num % 10).toString())
    return result + ((num % 10) * (num % 10))
}