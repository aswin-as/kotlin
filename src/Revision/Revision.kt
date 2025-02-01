package Revision

import kotlin.math.max

fun main() {
    /*
    println("The greatest number of 5 and 3 are : ${getMax(5,3)}")
    println("The greatest number of 5 and 3 are : ${max(10,6)}")
    println(sayHello())

    println("The greatest number of 5 and 3 are : ${getMax(5.22,3.5)}")
    println("The greatest number of 5 and 3 are : ${getMax(5.5f,3.3f)}")

    println("Sum of 1,2,3,4,5,6 = ${sum(1,2,3,4,5,6)}")
    */

//    forLoopExample()

//    doWhileLoopExample()

//    val a = appStationInterviewQuestion()
//    println(a)

    val name = arrayOf("aswin", "achu", "anagha")
   /* for (i in name) {
        println(i)

    }

    */

    nullable()

    println("Now printing elvis")

    elvis()

}




// Types of function

// 1. Normal function

//fun getMax(a: Int, b: Int): Int {
//    val max = if (a>b) a else b
//    return max
//}


// 2. Single Expression Function

fun getMax(a: Int, b: Int): Int = if (a>b) a else b
fun sayHello() = "Hello Guys!"


// 3. Function overloading

fun getMax(a: Double, b: Double) = if (a>b) a else b
fun getMax(a: Float, b: Float) = if (a>b) a else b



// vararg

fun sum(vararg numbers: Int): Int {
    var result = 0

    for (i in numbers) {
        result = result + i
    }
    return result
}





// ForLoop example

fun forLoopExample() {
    for (i in 1..10) {
        println(i)
    }

    println("using until")

    for (i in 1 until 10) {
        println(i)
    }

    println("using downTop")

    for (i in 10 downTo 1) {
        println(i)
    }

    println("now we are using step")

    for (i in 0 ..10 step 3) {
        println(i)
    }
}


// Do while loop example

fun doWhileLoopExample() {
    var i = 0

    println("Do while loop example")

    while (i <= 5) {
        println(i)
        if (i == 3) break
        i++
    }
}

fun appStationInterviewQuestion(): List<Int> {
    val array = arrayOf("23","44","63")

    var result = mutableListOf<Int>()

    for (i in array) {
        val a = i[0].digitToInt()
        val b = i[1].digitToInt()

        val output = when {
            a > b -> a - b
            a < b -> a + b
            a == b -> a*b
            else -> a / b
        }

        result.add(output)
    }

    return result
}


fun nullable() {

    var s1: String = "Geeks"

    //To allow a variable to hold null,
// we can declare a variable as nullable string,
// written String?

     var str: String? = null

    var len = str?.length

    print(len)

}

fun elvis() {
    var lastName: String? = null

    var length = if (lastName != null) lastName?.length else 0

    println(length)

    val length2: Int = lastName?.length ?: 0
}