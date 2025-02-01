package Functions

import kotlin.math.max

fun main() {
    println("Enter two int")
    val a = readlnOrNull()?.toIntOrNull()
    val b = readlnOrNull()?.toIntOrNull()

    if (a != null && b != null) println("The max value is ${getMax(a,b)}") else println("Invalid Input")

    val c = 7.5
    val d = 5.5

    println("The max number is ${getMax(c,d)}")





}


fun getMaxs(a:Int, b: Int): Int{
    val max = if (a>b) a else b

    return max
}

// This is called Single Expression function
//fun getMax(a: Int, b: Int): Int = if (a>b) a else b

//Function Overloading

fun getMax(a: Int, b: Int) = if (a>b) a else b
fun getMax(a: Double, b: Double) = if (a>b) a else b