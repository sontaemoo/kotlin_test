package chapter04

import java.io.File

fun main() {
    A.bar()
    val subscribingUser = User9.newSubscribingUser("test@gmail.com")
    val facebookUser = User9.newFacebookUser(10)
    
    println(subscribingUser.nickname)

    Person2.Loader.fromJSON("")
    Person2.fromJSON("")

    Person3.Companion.fromJSON("")
    Person3.fromJSON("")
}

class Person2(val name: String) {
    companion object Loader {
        fun fromJSON(jsonText: String): Person2 = Person2(jsonText.substringBefore("."))
    }
}

class Person3(val name: String) {
    companion object {
        fun fromJSON(jsonText: String): Person2 = Person2(jsonText.substringBefore("."))
    }
}


interface JSONFactory<T> {
    fun fromJSON(jsonText: String): T
}

class Person4(val name: String){
    companion object: JSONFactory<Person4>{
        override fun fromJSON(jsonText: String): Person4 {
            return Person4("df")
        }
    }
}

//fun loadFromJSON<T>(factory: JSONFactory<T>): T {
//
//}


class Person5(val name: String) {
    companion object {
    }
}

fun Person5.Companion.fromJSON(json: String): Person5 {
    return Person5("test")
}