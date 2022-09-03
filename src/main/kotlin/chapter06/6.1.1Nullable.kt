package chapter06

fun main() {
//    strLen(null)

    val x: String? = null
//    val y: String = x;

    println(strLenSafe2(x))
    println(strLenSafe2("abc"))
}
fun strLen(s:String) = s.length

//fun strLenSafe(s: String?) = s.length

fun strLenSafe2(s: String?):Int = if(s != null) s.length else 0
