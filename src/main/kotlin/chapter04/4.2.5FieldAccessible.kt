package chapter04

fun main() {
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("hello!")
    println(lengthCounter.counter)
    lengthCounter.addWord("my name is gg")
    println(lengthCounter.counter)
}
class LengthCounter {
    var counter: Int = 0
        private set
    fun addWord(word: String) {
        counter += word.length
    }
}