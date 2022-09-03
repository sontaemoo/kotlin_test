package chapter06

fun main() {
    val list = listOf("a", "b", "c")
    printInUppercase(list)
}

fun printInUppercase(list: List<String>) {
    println(CollectionUtil.uppercaseAll(list))
    println(list.first())
}