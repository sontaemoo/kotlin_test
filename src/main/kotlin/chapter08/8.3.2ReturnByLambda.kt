package chapter08

fun main() {
    val people = listOf(Person3("Alice", 29), Person3("Bob", 31))
    lookForAlice3(people)
    lookForAlice4(people)
}

fun lookForAlice3(people: List<Person3>) {
    people.forEach lable@ {
        if(it.name == "Alice") {
            return@lable
        }
    }
    println("Alice might be somewhere")
}

fun lookForAlice4(people: List<Person3>) {
    people.forEach{
        if(it.name == "Alice") {
            return@forEach
        }
    }
    println("Alice might be somewhere")
}