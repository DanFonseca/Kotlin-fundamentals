package extensions

fun main() {

    val name = "Daniel"
    println(name.slim())
    println(name.betterLength)

    val names = arrayListOf("Daniel", "Pedro", "Jorge")
    println(names.howMany())
    println(Int.typeOfClass())
}

fun String.slim(): String {
    return this.substring(0, 1)
}

fun  List<String>.howMany() = this.size

fun Int.Companion.typeOfClass (){
    println("This is a Integer Class")
}

val String.betterLength: Int
    get() = this.length

suspend fun teste(){

}


