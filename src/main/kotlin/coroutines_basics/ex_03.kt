package coroutines_basics_03

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    doWorld()
}

suspend fun doWorld() = coroutineScope{
    launch {
        delay(1000)
        println("World!")
    }
    println("Hello")
}
