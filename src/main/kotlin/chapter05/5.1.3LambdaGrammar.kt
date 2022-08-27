package chapter05

fun main() {

    val sum = {x:Int, y:Int -> x + y}
    println(sum(4,5));

    { println(45) }()
    run { println(33) }

    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.maxByOrNull({ p:Person -> p.age }))
    println(people.maxByOrNull(){ p:Person -> p.age })
    println(people.maxByOrNull{ p:Person -> p.age })
    println(people.maxByOrNull{ p -> p.age })
    println(people.maxByOrNull{ it.age })

    val getAge = {p:Person -> p.age}
    people.maxByOrNull(getAge)

    val people2 = listOf(Person("이몽룡", 29), Person("성춘향", 31))
    val names = people2.joinToString(separator = " ", transform = {p: Person -> p.name})
    val names2 = people2.joinToString(" "){p: Person -> p.name}
    println(names)
    println(names2)
}
