package sample

import io.ktor.client.HttpClient

actual class Sample {
    actual fun checkMe() = 7
}

actual object Platform {
    actual val name: String = "iOS3"
}