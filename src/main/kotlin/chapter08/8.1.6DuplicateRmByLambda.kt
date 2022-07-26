package chapter08

fun main() {
    val averageWindowsDuration = log.filter { it.os == OS.WINDOWS }.map(SiteVisit::duration).average()
    println(averageWindowsDuration)

    println(log.averageDurationFor(OS.WINDOWS))
    println(log.averageDurationFor(OS.MAC))

    val averageMobileDuration = log.filter { it.os in setOf(OS.IOS, OS.ANDROID) }.map(SiteVisit::duration).average()
    println(averageMobileDuration)

    println(log.averageDurationFor2 { it.os in setOf(OS.ANDROID, OS.IOS) })
    println(log.averageDurationFor2 { it.os == OS.IOS && it.path == "/signup" })
}
enum class OS{WINDOWS, LINUX, MAC, IOS, ANDROID}
data class SiteVisit(val path: String, val duration: Double, val os:OS)
val log = listOf(
    SiteVisit("/", 34.0, OS.WINDOWS),
    SiteVisit("/", 22.0, OS.MAC),
    SiteVisit("/login", 12.0, OS.WINDOWS),
    SiteVisit("/signup", 8.0, OS.IOS),
    SiteVisit("/", 16.3, OS.ANDROID),
)

fun List<SiteVisit>.averageDurationFor(os: OS) = filter {it.os == os}.map(SiteVisit::duration).average()

fun List<SiteVisit>.averageDurationFor2(predicate: (SiteVisit) -> Boolean) = filter(predicate).map(SiteVisit::duration).average()