fun main() {
    val y = readLine()!!.toInt()
    
    validate(y)

    
}

fun validate(num: Int){
        
    if (num % 4 == 0){
        if (num % 100 == 0 && num % 400 != 0 ){
            print("false")
        }else {
            print("true")
        }
    }else {
        print("false")
    }
    
}