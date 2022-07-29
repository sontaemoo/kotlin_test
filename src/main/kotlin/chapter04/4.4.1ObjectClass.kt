package chapter04

import java.io.File

fun main() {
    Payroll.allEmployees.add(Person("태무"))
    Payroll.calculateSalary()

    println(CaseInsensitiveFileComparator.compare(File("/User"), File("/user")))

    val files = listOf(File("/Z"), File("/a"))
    println(files.sortedWith(CaseInsensitiveFileComparator))

    var persons = listOf(Person("태무"), Person("아무개"))
    println(persons.sortedWith(Person.NameComparator))
}

object Payroll {
    val allEmployees = arrayListOf<Person>()
    fun calculateSalary() {
        println(allEmployees.size)
    }
}

//class Person(val name: String) {
//
//}

object CaseInsensitiveFileComparator: Comparator<File> {
    override fun compare(f1: File, f2: File): Int {
        return f1.path.compareTo(f2.path, ignoreCase = true)
    }
}

data class Person(val name: String) {
    object NameComparator: Comparator<Person> {
        override fun compare(p1: Person, p2: Person): Int = p1.name.compareTo(p2.name)
    }
}