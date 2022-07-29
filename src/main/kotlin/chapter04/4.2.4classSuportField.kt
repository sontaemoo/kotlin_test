package chapter04

fun main() {
    val user = User7("태무")
    user.address = "우리집"

}

class User7(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println("""
                Address was changed for $name:
                "$field" -> "$value".""".trimIndent())
            println("before : $address")
            field = value
//            address = value
            println("after : $address")
        }
}