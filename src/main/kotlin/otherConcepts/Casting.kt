package otherConcepts

import kotlin.random.Random


fun main() {

    if (BMW() is Car) {
        (BMW() as Car).run {
            printMyCar()
        }
    }

    var nullableObject = (BMW() as? Bicycle)
    println(nullableObject ?: "The object is null")


    println("---------------------------------")

    returnAnimalsRandom().forEach {
        (it as? Dog)?.bark()
        (it as? Cat)?.purr()
    }
}


open class Car {
    open fun printMyCar() {}
}

class BMW : Car() {
    override fun printMyCar() {
        println("My Car is BMW!")
    }

}

class Bicycle() {

}


open class Animal() {}

class Cat() : Animal() {
    fun purr() {
        println("Meooow! =3")
    }
}

class Dog() : Animal() {
    fun bark() {
        println("Au, Au! =P")
    }
}

fun returnAnimalsRandom(): List<Animal> {
    val animals = arrayListOf<Animal>()

    for (i in 1..20) {
        animals.add(
                if (Random.nextInt() % 2 == 0)
                    Dog()
                else
                    Cat()
        )
    }

    return animals
}