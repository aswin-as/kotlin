package Chapter2Operators

fun main() {
    var x = 5
    val y = 3



    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")

    var result = x + y

    result += 2
    println("Result = $result")

    result -= 2
    println("Result = $result")

    result *= 2
    println("Result = $result")

    result /= 2
    println("Result = $result")

    result %= 2
    println("Result = $result")

    var z = 0
    z++
    println("z is now $z")
    z--
    println("z is now $z")


}