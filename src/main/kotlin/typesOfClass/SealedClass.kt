package typesOfClass

fun main () {

    when(getVehicle()){
        is Bicycle -> println("Its a Bike")
        is Car -> println("Its a Car")
    }
}


fun getVehicle () :  Vehicle  =  Pegasus ()


abstract class Vehicle ()

sealed class  Bicycle () : Vehicle()

sealed class  Car () : Vehicle()

class BMW : Car ()

class Pegasus : Bicycle ()
