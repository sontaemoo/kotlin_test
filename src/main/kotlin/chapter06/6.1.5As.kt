package chapter06

fun main() {
    val p1 = Person2("Demitry", "Jemerov")
    val p2 = Person2("Demitry", "Jemerov")

    println(p1 == p2)
    println(p1.equals(42))
}

class Person2(val firstName: String, val lastName: String) {
    override fun equals(o: Any?): Boolean {
        val otherPerson = o as? Person2 ?: return false
        return otherPerson.firstName == firstName && otherPerson.lastName == lastName
    }
    override fun hashCode(): Int = firstName.hashCode() * 37 + lastName.hashCode()
}