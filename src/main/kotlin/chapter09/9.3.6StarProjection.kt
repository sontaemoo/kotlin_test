package chapter09

import kotlin.random.Random
import kotlin.reflect.KClass

fun main() {
    val list: MutableList<Any?> = mutableListOf('a', 1, "qwe")
    val chars = mutableListOf('a', 'b', 'c')
    val unknownElements: MutableList<*> = if(Random.nextBoolean()) list else chars

//    unknownElements.add(42)

    println(unknownElements.first())

    printFisrt(listOf("Svetlana", "Dmitry"))


    val validators = mutableMapOf<KClass<*>, FieldValidator<*>>()
    validators[String::class] = DefaultStringValidator
    validators[Int::class] = DefaultValidator

//    validators[String::class]!!.validate("")
    val stringValidator = validators[String::class] as FieldValidator<String>
    println(stringValidator.validate(""))


    val stringValidator2 = validators[Int::class] as FieldValidator<String>
//    println(stringValidator2.validate(""))

    Validators.registerValidator(String::class, DefaultStringValidator)
    Validators.registerValidator(Int::class, DefaultValidator)
    println(Validators[String::class].validate("Kotlin"))
    println(Validators[Int::class].validate(42))
}

fun printFisrt(list: List<*>) {
    if(list.isNotEmpty()) {
        println(list.first())
    }
}

fun <T> printFirst2(list: List<T>) {
    if(list.isNotEmpty()) {
        println(list.first())
    }
}

interface FieldValidator<in T> {
    fun validate(input: T): Boolean
}

object DefaultStringValidator: FieldValidator<String> {
    override fun validate(input: String): Boolean {
        return input.isNotEmpty()
    }
}
object DefaultValidator: FieldValidator<Int> {
    override fun validate(input: Int): Boolean {
        return input >= 0
    }
}

object Validators {
    private val validators = mutableMapOf<KClass<*>, FieldValidator<*>>()
    fun <T: Any> registerValidator(kClass: KClass<T>, fieldValidator: FieldValidator<T>) {
        validators[kClass] = fieldValidator
    }

    operator fun <T: Any> get(kClass: KClass<T>): FieldValidator<T> = validators[kClass] as? FieldValidator<T> ?: throw IllegalArgumentException("No validator for ${kClass.simpleName}")
}