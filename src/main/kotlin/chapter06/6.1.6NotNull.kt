package chapter06

fun main() {
    ignoreNulls(null)
}
fun ignoreNulls(s: String?) {
    val sNotNull: String = s!!
    println(sNotNull.length)
}