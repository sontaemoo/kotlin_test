package chapter04

import javax.naming.Context
import javax.swing.text.AttributeSet

fun main() {
}

interface User6 {
//    val email: String
    val nickname: String
//        get() = email.substringBefore('@')
}

class PrivateUser(override val nickname: String) : User6

class SubscribingUser(val email: String): User6 {
    override val nickname: String
        get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int): User6 {
    override val nickname = getFacebookName(accountId)
//    override val nickname: String
//        get() = TODO("Not yet implemented")
}

fun getFacebookName(accountId: Int): String = "${accountId} name"