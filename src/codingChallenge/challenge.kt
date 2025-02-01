package codingChallenge

var number = 20
fun main() {
    var evenNumberCounter = 0
    for (i in 0..number) {
        if (i % 2 == 0) {
            println("The $i is even number.")
            evenNumberCounter++
        } else{
            continue
        }
    }

    println("The total even numbers are: $evenNumberCounter")
}