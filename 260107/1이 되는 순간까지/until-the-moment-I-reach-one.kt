fun main() {
    val n = readLine()!!.toInt()
    // Please write your code here.
    val resul = fact(n)
    print(count)
}
var count = 0

fun fact(num: Int){
    if (num == 1){
        return
    }

    if (num % 2 == 0){
        fact(num / 2)
    }else {
        fact(num/3)
    }
    count ++
}