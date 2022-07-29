package chapter04

import java.io.File

fun main() {
    A.bar()
    val subscribingUser = User9.newSubscribingUser("test@gmail.com")
    val facebookUser = User9.newFacebookUser(10)

    println(subscribingUser.nickname)
}

class A {
    companion object {
        fun bar() {
            println("Companion Object called")
        }
    }
}

class User8 {
    val nickname: String

    constructor(email: String) {
        nickname = email.substringBefore("@")
    }

    constructor(facebookAccountId: Int) {
        nickname = getFacebookName(facebookAccountId)
    }
}

class User9 private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) = User(email.substringBefore("@"))
        fun newFacebookUser(accountId: Int) = User(getFacebookName(accountId))
    }
}