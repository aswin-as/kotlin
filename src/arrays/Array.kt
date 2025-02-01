package arrays

fun main() {
    val names= arrayOf("apple","orange","grapes","banana")

    for (i in names.size-1 downTo 0) {
        if (i % 2 == 0) println(names[i]) else continue

    }




}

