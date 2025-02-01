package Loops

fun main() {
    var number = 0

//    while (number < 10) {
//        number++
//        if (number ==7) {
//
//            continue
//        }
//        println(number)
//
//    }


    for (i in 0..10){
        if (i in 3..8){
            continue
        }
        println(i)
    }

}



