package chapter05

fun main() {
    val people = listOf(Person("Alice", 27), Person("Bob", 31), Person("Carol", 31))
    println(people.groupBy { it.age })

    val list = listOf("a", "ab", "b")
    println(list.groupBy(String::first))
}