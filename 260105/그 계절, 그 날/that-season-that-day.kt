fun main() {
    val (y, m, d) = readln().split(" ").map { it.toInt() }
    
    var isFlag = -1
    val isSpecialYear = isSpecialYear(y)
    for (i in 1 .. 12){
        if (i == m){
            var maxDay = 30

            if (i == 2 && isSpecialYear){ 
                maxDay = 29
            }else if (i == 2){
                maxDay = 2
            }else if (i % 2 == 1 && i <= 7){
                maxDay = 31
            }else if (i % 2 == 0 && i >= 8){
                maxDay = 31
            }

            for (j in 1 .. maxDay){
                if (j == d){
                    isFlag = i
                }
            }
        }
    }

    if (isFlag == -1){
        print("-1")
    } else {
        val result = validateSeason(isFlag)
        print(result)
    }
}

fun validateSeason(month: Int): String{
    if (3<=month &&month <=5){
        return "Spring"
    } else if (6<=month && month <=8){
        return "Summer"
    }else if (9<=month && month <=11){
        return "Fall"
    }else {
        return "Winter"
    }
}

fun isSpecialYear(year: Int):Boolean{
    if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
        return true
    } else if(year % 4 == 0 && year % 100 == 0) {
        return false
    } else if (year % 4 == 0) {
        return true
    } else {
        return false
    }
}