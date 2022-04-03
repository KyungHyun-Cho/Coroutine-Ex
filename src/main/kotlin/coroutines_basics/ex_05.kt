package coroutines_basics_05

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val job = launch {
        delay(1000)
        println("World!")
    }

    println("Hello")
    job.join() // 자식 코루틴(job) 이 완료될 때까지 대기
    println("DONE")
}
