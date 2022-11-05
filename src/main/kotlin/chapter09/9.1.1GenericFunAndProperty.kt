package chapter09

fun main() {
    val letters = ('a'..'z').toList()
    println(letters.slice<Char>(0..2))
    println(letters.slice(10..13))


    val authors = listOf("Dmitry", "Svetlana")
    val readers = mutableListOf<String>("Dmitry", "Svetlana", "Son", "Tae", "Moo")

    println(readers.filter { it !in authors });

    println(listOf(1,2,3,4,5).penultimate);
}

//fun <T> List<T>.filter(predicate: (T) -> Boolean): List<T>

val <T> List<T>.penultimate: T
    get() = this[size - 2]