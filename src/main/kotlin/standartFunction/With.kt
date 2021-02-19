package standartFunction
fun main () {

   with(Person()){
        name = "Daniel"
        age = 25
        printMyName()
    }


}


class Person () {
    var name = ""
    var age = 0

    fun printMyName (){
        println("my name is $name and my age is $age")
    }
}