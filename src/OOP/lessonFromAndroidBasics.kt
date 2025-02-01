package OOP

class SmartDevice(val name: String, val category: String) {


    val deviceStatus = "Online"

    var speakerVolume = 2

    fun turnOn() {
        println("Smart device is turned on.")
    }

    fun turnOff() {
        println("Smart device is turned off.")
    }

}

fun main() {

    val smartTvDevice = SmartDevice(name = "Android Tv", category = "Entertainment")
    println("Device name is : ${smartTvDevice.name}")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}

