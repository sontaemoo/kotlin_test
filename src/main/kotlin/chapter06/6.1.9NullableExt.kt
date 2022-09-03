package chapter06

fun main() {
    verifyUserInput(" ")
    verifyUserInput(null)

    val person: Person? = Person("test", null)
//    person.let { sendEmailTo(it.name) }
    person?.let { sendEmailTo(it.name) }

}

fun verifyUserInput(input: String?) {
    if(input.isNullOrBlank()) {
        println("Please fill in the required fields")
    }
}