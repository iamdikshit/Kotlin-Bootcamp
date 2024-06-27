package oopsproblems.polymorphismproblem

/*
* Medium Problem: Polymorphic Vehicles
* Create an abstract class Vehicle with an abstract method drive(). Implement two classes
* Car and Bicycle that inherit from Vehicle and provide their own implementation of the
* drive() method. Write a function that takes a list of Vehicle objects and calls drive()
* on each.
*
*/

abstract class Vehicle{
    abstract fun drive()
}

class Bicycle: Vehicle() {
    override fun drive() {
        println("Bicycle driving starts..")
    }
}

class Car: Vehicle() {
    override fun drive() {
        println("Car driving starts..")
    }
}

fun allVehicle(vehicles:List<Vehicle>){
    for (vehicle in vehicles){
        vehicle.drive()
    }
}
fun main(){
    val listOfVehicle:List<Vehicle> = listOf(
        Car(),
        Bicycle(),
        Car()
    )
    allVehicle(listOfVehicle)
}
