package Loops

fun main() {
    var number = 0

    /*
    the outer@ is used to identify a thing, if you want to
    break a outer loop, you need to use break@outer
     */
  outer@  while (number < 10) {
        println(number)
        number++

        var i = 0

        while ( i <  5 ) {
            if (i == 2) break@outer
            println("The value of the i is $i")
            i++
        }
    }
}