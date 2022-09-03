package chapter06

import java.io.File

fun main() {

}

class FileIndexer: FileContentProcessor {
    override fun processContents(path: File, binaryContents: ByteArray?, textContents: MutableList<String>?) {
        TODO("Not yet implemented")
    }
}

class PersonParser: DataParser<Person> {
    override fun parseData(input: String, output: MutableList<Person>, errors: MutableList<String?>) {
        TODO("Not yet implemented")
    }
}