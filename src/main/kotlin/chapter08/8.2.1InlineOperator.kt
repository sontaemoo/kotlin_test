package chapter08

import java.util.concurrent.locks.Lock

fun main() {

}

inline fun <T> synchronized(lock: Lock, action: () -> T): T {
    lock.lock()
    try{
        return action()
    }
    finally {
        lock.unlock()
    }
}

fun foo(l: Lock) {
    println("Before sync")
    synchronized(l) {
        println("Action")
    }
    println("After sync")
}

class LockOwner(val lock: Lock) {
    fun runUnderLock(body: () -> Unit) {
        synchronized(lock, body)
    }
}