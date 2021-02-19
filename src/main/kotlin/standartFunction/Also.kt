package standartFunction

fun main (){

    Book().apply {
        name = "Dom Casmurro"
        printBookName()
    }
            .also { book ->
                println("The Book ${book.name} was printed ")
                println("sending email...")
            }

}
class Book {
    var name = ""

    fun printBookName () {
        println("Printing Book $name")
    }
}