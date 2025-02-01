package OOP

fun main() {
    val user = User3(name = "Rajini")

    user.firstName = "Vlad"

    println(user.firstName)
    println(user.lastName)
    println(user.age)


}

// secondary constructor

class User2( var name: String, val lastName: String, var age: Int) {

    constructor(name: String, lastName: String):this(name, lastName,0 ) {
        println("Second constructor")
    }

    constructor(name: String, age: Int): this(name,"LastName",age){
        // you can put curly braces
        println("Third Constructor")
    }

}

// default values in the constructor

class User3(  name: String, var lastName: String = "LastName", var age: Int =0) {

    var firstName = name
        get() {
            return "FirstName: $field"
        }
        set(value) {
            println("$value was assigned to firstName property")
            field = value
        }



}