package chapter08

fun main() {
    val people = listOf(Person3("Alice", 29), Person3("Bob", 31))
    lookForAlice5(people)

    people.filter(fun (person): Boolean {
        return person.age < 30
    })

    people.filter(fun (person) = person.age < 30)
}

fun lookForAlice5(people: List<Person3>) {
    people.forEach(fun (person) {
        if(person.name == "Alice") {
            return
        }
        println("${person.name} is not Alice")
    })

}