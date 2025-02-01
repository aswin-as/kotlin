package Nullability


fun main() {

    var text: String? = null
    // Elvis Operator

    var text2: String


    // this is the shorter way of doing this thing.
    text2 = text?: "helo"

    // this is the longer way

//    if (text != null) {
//        text2 = text
//    }else {
//        text2 = "This is a text2 variable."
//    }

    println(text2)

    val a: String? = null

    val aLength: String

    aLength = (a?.length?: "The variable is null").toString()

    println(aLength)


}