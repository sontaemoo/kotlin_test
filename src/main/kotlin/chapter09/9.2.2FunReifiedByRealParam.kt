package chapter09

fun main() {

    println(isA<String>("abc"))
    println(isA<String>(123))

    val items = listOf("abc", 123, "def")
    val strItems = items.filterIsInstance<String>()
    val intItems = items.filterIsInstance<Int>()
    println(strItems)
    println(intItems)
}

inline fun <reified T> isA(value: Any) = value is T