package chapter09

fun main() {
    printContents(listOf("abc", "def"))

    val strings = mutableListOf("abc", "def")
//    addAnswer(strings)
}

fun printContents(list: List<Any>) {
    println(list.joinToString())
}

fun addAnswer(list: MutableList<Any>) {
    list.add(42)
}