package chapter05

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))

    val getAge = {person:Person -> person.age}

    people.maxByOrNull(Person::age)
    people.maxByOrNull { p -> p.age }
    people.maxByOrNull { it.age }
    fun salute() = println("Salute!")
    run(::salute)


    val action = {person:Person, message:String -> sendEmail(person, message)}
    val nextAction = ::sendEmail

    val createPerson = ::Person
    val p = createPerson("Alice", 29)
    println(p)

    val predicate = Person::isAdult

}
fun sendEmail(person:Person, message:String) {
    println("${person.name} send ${message} message")
}

fun Person.isAdult() = age >= 21