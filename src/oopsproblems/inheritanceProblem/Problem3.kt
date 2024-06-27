package oopsproblems.inheritanceProblem

/*
* Problem 10: Smart Device Hierarchy
* Create a base class SmartDevice with properties brand and model, and a method
* connectToWifi(). Create subclasses Smartphone, Smartwatch, and SmartTV that add
* specific properties and methods for each type of device (e.g., Smartphone can have
* screenSize, Smartwatch can have batteryLife, SmartTV can have screenResolution).
*/

// base class
open class SmartDevice(
    val brand:String,
    val model:String
){
    fun connectToWifi(){
        println("Wifi connected!!")
    }
}
// subclass
 class Smartphone(
    brand: String,
    model: String,
    private val screenSize:Int
):SmartDevice(brand,model){
    fun display(){
        println("I am smartphone with screen size $screenSize")
    }
}

class Smartwatch(
    brand: String,
    model: String,
    private val batteryLife:Int
):SmartDevice(brand,model){
    fun display(){
        println("I am smartwatch with battery life : $batteryLife%")
    }
}

class SmartTV(
    brand: String,
    model: String,
    private val screenResolution:Int
):SmartDevice(brand,model){
    fun display(){
        println("I am smartwatch with resolution : $screenResolution")
    }
}