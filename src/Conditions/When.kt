package Conditions

fun main() {

    val alaram = 8

    when(alaram) {
        in 1..7 -> println("The alram is set to $alaram")
        in 8..16 -> println("the alarm is set to $alaram")
        else -> println("the alaram isn't set man!")
    }
    val a = character(3.14)
//    println(a)
}

fun character(a: Any): String {
   return when(a) {
         is Int -> "Its an int"
         is String -> "Its an string"
         is Float-> "Its an Float"
        else -> "Its some other datatype"
    }


}

