package collection

fun String.lastChar(): Char = this.get(this.length - 1)
fun String.lastChar2(): Char = get(length - 1)

fun String.lastChar3(): Char {
    return '1';
}

fun main() {
    println("asdf".lastChar())
    println("asdf".lastChar2())
}

class Test {
    private val t1 = "t1"
    protected val t2 = "t2"
}

//fun Test.getT1(): String = t1;
//fun Test.getT2(): String = t2;