package collections

fun main () {
    val setNumbers = setOf(1,2,3,4,5,6,1,2, null, null)
    println(setNumbers)

    val hashsetNumber = hashSetOf(1,2,3,4,5,6,7,7)
    hashsetNumber.add(10)
    val anotherSetNUmber = setOf(15,20,30)
    hashsetNumber.addAll(anotherSetNUmber)
    hashsetNumber.remove(30)
    
    println(hashsetNumber)


    ArgUments(a="", "teste")
}

data class ArgUments (var a: String, var b: String){}
