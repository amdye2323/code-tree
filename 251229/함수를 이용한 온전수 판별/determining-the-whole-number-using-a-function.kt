fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    
    var cnt = 0
    for (i in a .. b){
        val result = calculate(i)
        if (result){
            cnt ++
        }
    }
    print(cnt.toString())
}

fun calculate(num: Int): Boolean{
    if (num %2 === 0){
        return false
    }

    if ((num%10) === 5){
        return false
    }

    if (num%3 === 0 && num% 9 != 0){
        return false
    }

    return true
}