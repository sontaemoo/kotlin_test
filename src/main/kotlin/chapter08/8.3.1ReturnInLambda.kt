package chapter08

fun main() {
    val people = listOf(Person3("Alice", 29), Person3("Bob", 31))
    lookForAlice(people)
    lookForAlice2(people)
}

data class Person3(val name: String, val age: Int)

fun lookForAlice(people: List<Person3>) {
    for(person in people) {
        if(person.name == "Alice") {
            println("Found!")
            return
        }
    }
    println("Alice is not found")
}


fun lookForAlice2(people: List<Person3>) {
    people.forEach {
        if(it.name == "Alice") {
            println("Found!")
            return
        }
    }
    println("Alice is not found")
}