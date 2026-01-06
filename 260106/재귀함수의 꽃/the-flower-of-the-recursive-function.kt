fun main() {
    val n = readLine()!!.toInt()
    // Please write your code here.
    reculsive(n)
}

fun reculsive(num: Int){
    if (num == 0){
        return 
    }

    print(num.toString()+" ")
    reculsive(num-1)
    print(num.toString()+" ")
}