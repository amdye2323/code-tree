import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val line = br.readLine()
    val map = HashMap<Char,Int>()
    val input = br.readLine().toCharArray()[0]
    
    line.trim().forEach { st ->
        var cnt = map.getOrDefault(st,0) 
        cnt ++
        map.set(st,cnt)
    }
    
    print(map.getOrDefault(input,0))
}