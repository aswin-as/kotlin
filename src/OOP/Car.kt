package OOP


class Car(var name: String , var model: String , var color:String , var doors: Int) {


    fun move() {
        println("The $name is moving.")
    }

    fun stop() {
        println("The $name is stopped.")
    }
}