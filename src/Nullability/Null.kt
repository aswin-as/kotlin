package Nullability

fun main() {

    var text: String? = null

    //we can do it with if statement

    if (text != null){
        println(text.length)
    }

    //Or there is a easy way we can use "?." this

    println(text?.length)

    // this "text?.length" this do what is it the text is null, it print null , else it print the length of the text.

}