package codingChallenge


fun main() {

    val numbers = arrayOf(1,2,5,3,2,8,6,4,4,9,10,11,4,5)

        println(numbers.min())
        println("The greatest number is ${greatestNumber(numbers)}")

}


fun greatestNumber(num: Array<Int>): Int {
    var greatest = num[0]
    for (i in num) {
        if (i > greatest){
            greatest = i
        }
    }

    return greatest
}