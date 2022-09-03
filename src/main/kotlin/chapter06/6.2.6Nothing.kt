package chapter06

fun main() {
//    fail("Error occurred")

    val company: Company = Company("test", null)
    val address = company.address ?: fail("No address")
    println(address.city)
}

fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}