package chapter07

fun main() {
    val p = Person10("Alice")
    p.emails
    println("second")
    p.emails

    println("third")
    val p2 = Person11("Alice")
    p2.emails
    println("fourth")
    p2.emails
}
class Email(val email: String) {

}

fun loadEmails(person: Person10): List<Email> {
    println("${person.name}의 이메일을 가져옴")
    return listOf(Email("이메일"))
}

fun loadEmails2(person: Person11): List<Email> {
    println("${person.name}의 이메일을 가져옴")
    return listOf(Email("이메일"))
}

class Person10(val name: String) {
    private var _emails: List<Email>? = null
    val emails: List<Email>
        get() {
            if(_emails == null) {
                _emails = loadEmails(this)
            }
            return _emails!!
        }
}

class Person11(val name: String) {
    val emails by lazy { loadEmails2(this) }
}