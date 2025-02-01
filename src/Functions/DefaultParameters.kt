package Functions


// Default parameter

fun main() {
    sendMessage(name = "Aswin")
}

fun sendMessage(name: String = "Alexa", message: String = sendText()) {
    println("Name = $name, message = $message")
}

fun sendText() = "Good Morning!"
fun sendMeme() = "Ting Tong Ting!"