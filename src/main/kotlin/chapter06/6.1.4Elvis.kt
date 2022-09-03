package chapter06

import java.lang.IllegalArgumentException

fun main() {
    println(strLenSafe3("abc"))
    println(strLenSafe3(null))

    val address = Address("Elsestr. 47", 80687, "Munich", "Germany")
    val jetbrains = Company("JetBrains", address)
    val person = Person("Dmitry", jetbrains)

    println(printShippingLabel(person))

    println(printShippingLabel(Person("Alexey", null)))
}
fun foo(s: String?) {
    val t: String = s ?: ""
}

fun strLenSafe3(s: String?): Int = s?.length ?: 0

fun Person.countryName2() = company?.address?.country ?: "Unknown"

fun printShippingLabel(person: Person) {
    val address = person.company?.address ?: throw IllegalArgumentException("No address")
    with(address) {
        println(streetAddress)
        println("${zipCode} ${city} ${country}")
    }
}