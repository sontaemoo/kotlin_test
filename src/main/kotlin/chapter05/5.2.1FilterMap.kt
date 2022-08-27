package chapter05

fun main() {
    val list = listOf(1,2,3,4)
    println(list.filter { it % 2 == 0 })

    val people = listOf(Person("Alice", 28), Person("Bob", 31))
    println(people.filter { it.age > 30 })

    println(list.map{it * it})
    println(people.map{it.name})
    println(people.map(Person::name))

    println(people.filter { it.age > 30 }.map(Person::name))
    people.filter { it.age == people.maxByOrNull(Person::age)!!.age}
    val maxAge = people.maxByOrNull(Person::age)!!.age
    people.filter { it.age == maxAge }

    val numbers = mapOf(0 to "zeon", 1 to "one")
    println(numbers.mapValues { it.value.uppercase() })
}