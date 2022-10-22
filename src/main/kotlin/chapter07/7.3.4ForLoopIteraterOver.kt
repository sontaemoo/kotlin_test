package chapter07

import java.time.LocalDate

fun main() {
    for(c in "abc"){print(c)}
    val nowDate = LocalDate.now();
    // nowDate.apply {  }
    val newYear = LocalDate.ofYearDay(2017, 1)
    val daysOff = newYear.minusDays(1)..newYear
    for (dayOff in daysOff) {
        println(dayOff)
    }

}

operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
    object : Iterator<LocalDate> {
        var current = start
        override fun hasNext(): Boolean {
            return current <= endInclusive
        }

        override fun next() = current.apply { current = plusDays(1) }
    }