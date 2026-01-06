fun main() {
    val n = readLine()!!.toInt()
    // Please write your code here.
    val result = reculsive(n)

    print(result.toString())
}

fun reculsive(num: Int): Int{
    if (num == 1){
        return 1
    }
    return num + reculsive(num-1)
}