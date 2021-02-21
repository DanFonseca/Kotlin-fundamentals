
fun main (){

}

interface Person  {
    fun sayHello ()
}

class daniel : Person {
     var name: Person

    constructor(person: Person){
        name = person
    }


    override fun sayHello() {
        println("Hello, Guys!")
    }

}