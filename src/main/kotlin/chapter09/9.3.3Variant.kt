package chapter09

fun main() {

}

interface Producer<out T> {
    fun produce() : T
}

open class Animal {
    fun feed() {}
}

class Herd<T: Animal> {
    val size: Int get() = size
    operator fun get(i: Int): T = this[i]
}

fun feedAll(animals: Herd<Animal>) {
    for(i in 0 until animals.size) {
        animals[i].feed()
    }
}

class Cat: Animal() {
    fun cleanLitter() {}
}

fun takeCareOfCats(cats: Herd<Cat>) {
    for(i in 0 until cats.size) {
        cats[i].cleanLitter()
//        feedAll(cats);
    }
}

class Herd2<out T: Animal>(vararg animals: T) {
    val size: Int get() = size
    operator fun get(i: Int): T = this[i]
}


fun feedAll2(animals: Herd2<Animal>) {
    for(i in 0 until animals.size) {
        animals[i].feed()
    }
}
fun takeCareOfCats2(cats: Herd2<Cat>) {
    for(i in 0 until cats.size) {
        cats[i].cleanLitter()
        feedAll2(cats);
    }
}

//class Herd3<out T: Animal>(var leadAnimal: T, vararg animals: T) {
//    val size: Int get() = size
//    operator fun get(i: Int): T = this[i]
//}
