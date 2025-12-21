fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    // Please write your code here.
    var a = n
    var b = m
    while(b != 0){
        var r = a % b
        a = b
        b = r
    }
    print(a)
}