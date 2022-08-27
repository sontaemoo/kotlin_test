package chapter05

fun main() {
    val people = listOf(Person("Alice", 27), Person("Bob", 31), Person("Carol", 31), Person("Den", 21))

    people.map(Person::name).filter { it.startsWith("A") }
    people.asSequence().map(Person::name).filter { it.startsWith("A") }.toList()

    listOf(1,2,3,4).asSequence().map { println("map:${it}"); it * it }.filter { println("filter${it}"); it % 2 == 0 }

    listOf(1,2,3,4).asSequence().map { println("map:${it}"); it * it }.filter { println("filter${it}"); it % 2 == 0 }.toList()

    println(listOf(1,2,3,4).asSequence().map { it * it }.find { it > 3 })

    println(people.asSequence().filter { it.name.length < 4 }.map(Person::name).toList())
    println(people.asSequence().map(Person::name).filter { it.length < 4 }.toList())
}