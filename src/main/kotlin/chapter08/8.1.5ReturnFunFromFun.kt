package chapter08

fun main() {
    val calculator = getShippingCostCalculator(Delivery.EXPEDITED)
    println("Shipping costs ${calculator(Order(3))}")

    val contacts = listOf(Person("Dmitry", "Jemerov", "123-4567"),
                    Person("Svetlana", "Isakova", null))
    val contactListFilters2 = ContactListFilters2()
    with(contactListFilters2) {
        prefix = "Dm"
        onlyWithPhoneNumber = true
    }
    println(contacts.filter(contactListFilters2.getPredicate()))
}

enum class Delivery { STANDARD, EXPEDITED}

class Order(val itemCount: Int)

fun getShippingCostCalculator(delivery: Delivery): (Order) -> Double {
    if(delivery == Delivery.EXPEDITED) {
        return {order -> 6 + 2.1 * order.itemCount}
    }
    return {order -> 1.2 * order.itemCount}
}

class ContactListFilters {
    var prefix: String = ""
    var onlyWithPhoneNumber: Boolean = false
}

data class Person(val firstName: String, val lastName: String, val phoneNumber: String?)
class ContactListFilters2 {
    var prefix: String = ""
    var onlyWithPhoneNumber: Boolean = false
    fun getPredicate(): (Person) -> Boolean {
        val startsWithPrefix = {p: Person -> p.firstName.startsWith(prefix) || p.lastName.startsWith(prefix)}

        if(!onlyWithPhoneNumber) {
            return startsWithPrefix
        }
        return {startsWithPrefix(it) && it.phoneNumber != null}
    }
}