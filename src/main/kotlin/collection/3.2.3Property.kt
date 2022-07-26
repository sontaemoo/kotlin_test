package collection

fun main() {
    for(i in 1..10) {
        performOperation()
    }
    reportOperationCount()

}

var opCount = 0

fun performOperation() {
    opCount++
}

fun reportOperationCount() {
    println(opCount)
}

const val UNIX_LINE_SEPARATOR = "\n"