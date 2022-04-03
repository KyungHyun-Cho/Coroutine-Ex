package coroutines_basics_04

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking{
    doWorld()
    println("DONE")
}

suspend fun doWorld() = coroutineScope {
    launch {
        delay(2000)
        println("World 2")
    }
    launch {
        delay(1000)
        println("World 1")
    }
    println("Hello")
}

