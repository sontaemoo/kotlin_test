package chapter04

fun main() {
    val client1 = Client2("오현석", 4122)
    val client2 = Client2("오현석", 4122)

    println(client1.toString())
    println(client1 == client2)

    val processed = hashSetOf(Client2("오현석", 4122))

    println(processed.contains(Client2("오현석", 4122)))

    println(client1.hashCode())


    val lee = Client2("이계영", 4122)
    println(lee.copy(postalcode = 4000))

}

data class Client2(val name: String, val postalcode: Int) {
//    fun copy(name: String = this.name, postalcode: Int = this.postalcode) = Client2(name, postalcode)
}
