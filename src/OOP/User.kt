package OOP

class User(
     name: String,
    var lastName: String,
    var age: Int) {

    var name: String // why putting here a name var

    init {
        if (name.toLowerCase().startsWith('a')){
            this.name = name
        } else {
            this.name = "helo User"
            println("The name doesn't starts with the letter A or a.")
        }
    }

}

class User1( var name: String, val lastName: String) {

    init {
        if (name.toLowerCase().startsWith('a')) {
           name = name
        } else {
            name = "User"
            println("The name doesn't starts with the letter A or a.")
        }
    }
}