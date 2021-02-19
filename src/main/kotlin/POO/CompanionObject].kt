package POO

fun main() {
    println(CarCompanion.count())
    println(CarCompanion.count())
    val car1 = CarCompanion
    println(car1.count())

}

class CarCompanion() {

    companion object {
        private var count = 0
        fun count(): Int {
            return this.count++
        }
    }

}