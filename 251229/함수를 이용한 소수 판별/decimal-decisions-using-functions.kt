fun main() {
    val input = readLine()!!.split(" ").map { it.toInt() }
    val a = input[0]
    val b = input[1]
    
    var total = 0
    for (i in a .. b){
        var flag = true
        
        for (j in 2 until i){
            if (i%j == 0 ){
                flag = false
                break
            }
        }

        if (flag == true){
            total += i
        }
    }

    print(total)
}