package chapter04

fun main() {
    val cset = CountingSet<Int>()
    cset.addAll(listOf(3, 3, 9))

    println("${cset.objectsAdded} objects were added, ${cset.size} remain")
}

class DelecationCollection<T>: Collection<T> {
    private val innerList = listOf<T>()
    override val size: Int
        get() = innerList.size

    override fun isEmpty(): Boolean = innerList.isEmpty()
    override fun contains(element: T): Boolean = innerList.contains(element)
    override fun iterator(): Iterator<T> = innerList.iterator()
    override fun containsAll(elements: Collection<T>): Boolean = innerList.containsAll(elements)
}

class DelecationCollection2<T> (
    innerList: Collection<T> = listOf<T>()
) : Collection<T> by innerList {}

class CountingSet<T> (val innerSet: MutableCollection<T> = hashSetOf<T>()): MutableCollection<T> by innerSet {
    var objectsAdded = 0
    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdded += elements.size
        return innerSet.addAll(elements)
    }
}