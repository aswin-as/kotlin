package Loops

fun main() {
    // Defining a for loop
    // 1..10 is called range

//    for (i in 1..10) {
//        println("i = $i")
//    }

//    for (i in 1 until 10) {  // it prints 1 to 9, it doesn't print 10 because until means lesser than 10
//        println(i)
//    }

//   downWards()

    step()

//    printStar()
}

fun downWards() {
    // It will count downwards eg: 10,9,8....n
    for (i in 10 downTo 1) {
        println(i)
    }
}

fun step() {
    //it will skip the 2nd iteration , if you give 3 instead of 2 it will skip the 3rd iteration.
    for (i in 1 until 10 step 2) {
        println(i)
    }
}

fun printStar() {
    for (i in 1..5) {
        println("*".repeat(i))
    }
}