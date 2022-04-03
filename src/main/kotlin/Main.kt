import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * @author Kyunghyun Cho
 */
class Main {
}

/*fun main() {
    print("Hello World")
}*/

suspend fun main() = coroutineScope{
    launch{
        delay(1000)
        print("World!")
    }
    print("Hello ")
}
