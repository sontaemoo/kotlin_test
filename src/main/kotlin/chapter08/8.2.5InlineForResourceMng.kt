package chapter08

import java.io.BufferedReader
import java.io.FileReader

fun main() {

}

fun readFirstLineFromFile(path: String): String {
    BufferedReader(FileReader(path)).use { br ->
        return br.readLine()
    }
}