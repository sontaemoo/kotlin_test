package chapter06

fun main() {
    val email: String? = null
//    sendEmailTo(email)
    email?.let{email -> sendEmailTo(email) }
    email?.let{ sendEmailTo(it) }



    val person: Person? = getTheBestPersonInTheWorld()
    if(person != null) sendEmailTo(person.name)
    getTheBestPersonInTheWorld()?.let { sendEmailTo(it.name) }


}
fun sendEmailTo(email: String) {
    println("Sending email to ${email}")
}

fun getTheBestPersonInTheWorld(): Person? = null