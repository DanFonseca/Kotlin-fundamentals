package poo

fun main (){

    val bmw = Car()

}

class Car (var name: String, var model: String) {
    constructor () : this("", "") {
    }
}