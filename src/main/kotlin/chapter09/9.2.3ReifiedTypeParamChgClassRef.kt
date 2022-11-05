package chapter09

import java.security.Provider.Service
import java.util.ServiceLoader

fun main() {

    // Service::class.java(kotlin) == Service.class(java)
    val serviceImpl = ServiceLoader.load(Service::class.java)

    val serviceImpl2 = loadService<Service>()
}

inline fun <reified T> loadService(): ServiceLoader<T> {
    return ServiceLoader.load(T::class.java)
}