fun main() {
    val n = readLine()!!.toInt()
    // Please write your code here.
    val resul = fact(n)
    print(resul)
}
var count = 0

fun fact(num: Int): Int{
    if (num == 1){
        return num
    }

    if (num % 2 == 0){
        fact(num / 2)
    }else {
        fact(num/3)
    }
    count ++
    return count
}