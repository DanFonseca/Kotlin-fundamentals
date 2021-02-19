package POO

fun main() {

    val bank1 = bank()
    bank1.amount = 10.0
    bank1.amount = 5.0
    bank1.amount = 5.0

    println(bank1.rating)

}

class bank() {

    var amount: Double = 0.0
        set(value) {
            if (value > amount)
                rating++
            else
                rating--

            field = value
        }

    var rating: Int = 500
    private set

}