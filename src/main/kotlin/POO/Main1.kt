package POO

fun main (){

    sayHello (){
        a, b ->   a * b
    }

    dataBase.sayHello("hello")
}

fun sayHello (calculo: (Int, Int) -> Int)
{
    println(calculo (5,7))
}

object dataBase  {
     fun sayHello (text: String){
        println(text)
    }
}