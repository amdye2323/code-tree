fun main() {
    val n = readLine()!!.toInt()
    // Please write your code here.
    reculsive(n)
    println("")
    reculsiveRE(1,n)
}

fun reculsive(num: Int){
    if (num == 0){
        return 
    }
    reculsive(num-1)
    print(num.toString() + " ")
}

fun reculsiveRE(start: Int,goal: Int){
    if (goal < start){
        return
    }
    reculsiveRE(start+1,goal)
    print((start).toString() + " ")
}