package chapter07

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

fun main() {
    val p = Person16()
    val data = mapOf("name" to "Dmitry", "company" to "JetBrains")
    for((attrName, value) in data) {
        p.setAttribute(attrName, value)
    }
    println(p.name)


    val p2 = Person17()
    val data2 = mapOf("name" to "TDmitry", "company" to "JetBrains")
    for((attrName, value) in data2) {
        p2.setAttribute(attrName, value)
    }
    println(p2.name)
}

class Person16 {
    private val _attributes = hashMapOf<String, String>()
    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value;
    }

    val name: String
        get() = _attributes["name"]!!
}

class Person17 {
    private val _attributes = hashMapOf<String, String>()
    fun setAttribute(attrName:String, value:String) {
        _attributes[attrName] = value
    }
    val name: String by _attributes
}