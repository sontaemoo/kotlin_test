package chapter06

fun main() {

}

class StringPrinter: StringProcessor {
    override fun procesor(value: String) {
        println(value)
    }
}

class NullableStringPrinter: StringProcessor {
    override fun procesor(value: String?) {
        println(value)
    }
}
