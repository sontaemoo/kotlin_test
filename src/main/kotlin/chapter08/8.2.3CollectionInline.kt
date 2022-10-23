package chapter08

fun main() {
    val people = listOf(Person2("Alice", 29), Person2("Bob", 31))
    println(people.filter { it.age < 30 })

    val result = mutableListOf<Person2>()
    for(person in people) {
        if(person.age < 30) result.add(person)
    }
    println(result)

    println(people.filter { it.age < 30 }.map(Person2::name))
}

data class Person2(val name: String, val age: Int)
