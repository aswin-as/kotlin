package Functions


/*
    with the vararg we can pass unlimited number of arguments.
 */

fun main() {

    println(sum(4,5,6,6,3,3,2,2,2,1,2,2,3,4,3,2,1,3,))
        
}

fun sum(vararg numbers: Int): Int {
    var result = 0
    for (i in numbers) {
        result += i
    }

    return result
}