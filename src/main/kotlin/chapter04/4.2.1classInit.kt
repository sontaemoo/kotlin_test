package chapter04

import java.io.Serializable
import java.lang.IllegalArgumentException

fun main() {
    val user = User4("탬탬")
    println(user.nickname)
    println(user.isSubscribed)

    val user2 = User4("탬탬", false)
    println(user2.nickname)
    println(user2.isSubscribed)
}

class User(val nickname: String)

class User2 constructor(_nickname: String) {
    val nickname: String;
    init {
        nickname = _nickname
    }
}

class User3(_nickname: String){
    val nickname = _nickname
}

class User4(val nickname: String, val isSubscribed: Boolean = true)

open class User5(val nickname: String)
class TwitterUser(nickname: String) : User5(nickname)


class Secretive private constructor()