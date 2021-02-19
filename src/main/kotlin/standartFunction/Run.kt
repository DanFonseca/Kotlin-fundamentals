package standartFunction

fun main() {

    Restaurant().run {
        dishes = "Strogonoff"
        printDishes()
        this
    }

    run {
        val  scope = Restaurant()
        scope.dishes = "Hamburguer"
        scope.printDishes()
    }

}

class Restaurant {
    var dishes = "Special"
    fun printDishes() {
        println("Special today is $dishes")
    }

    override fun toString(): String {
        return dishes
    }
}