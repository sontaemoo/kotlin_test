package chapter05

fun main() {
    val books = listOf(Book("one", listOf("1a", "2a")), Book("two", listOf("1b", "2a")))

    println(books.flatMap { it.authors }.toSet())
    val authors = books.flatMap { it.authors }.toSet()
    println(authors.size)
//    println(books.flatMap{it.authors}.groupBy { it }.flatMap { it. })

    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() }.toSet())
    println(strings.flatMap { it.toList() }.toList())
}
class Book(val title:String, val authors: List<String>)