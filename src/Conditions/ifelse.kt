package Conditions

fun main() {
    val myNumber = 100

    if (myNumber > 100){
        println("The number is greater than 100")
    }else if (myNumber == 100){
        println("The number is 100")
    }
    else if (myNumber < 100){
        println("The number is lesser than 100")
    }


    val number = "12345"
    val myArray = arrayOf("22","33","44")
    var result = mutableListOf<Int>()

    for (i in myArray) {
        val a = i[0].digitToInt()
        val b = i[1].digitToInt()

        val output = when {
            a == b -> a + b
            else -> a - b
        }
        result.add(output)

    }
    println(result)
}