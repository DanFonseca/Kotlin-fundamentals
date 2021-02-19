package standartFunction

fun main() {
    //clientDontStartWithA()
    getOddNumber()
}

fun filterForOdd() {
    val numbers = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val pares = arrayListOf<Int>()

    numbers.forEach {
        it.takeIf { it % 2 == 0 }
                ?.let { //let com nullable, só irar executar se for != null
                    pares.add(it)
                }
    }

    pares.forEach(::println)
}

fun clientDontStartWithA() {
    val clients = arrayListOf("Amanda", "Alexandre", "Claudio", "Joao", "Aghata")
    val clientsWithOutA = arrayListOf<String>()

    clients.forEach { it ->
        it.toLowerCase()
                .takeUnless { it.startsWith('a') }
                ?.let {
                    clientsWithOutA.add(it)
                }
    }.also {
        clientsWithOutA.forEach(::println)
    }
}

fun getOddNumber() {
    val numbers = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 60, 100, 102)
    numbers.forEach {
        it.takeUnless { it == 3 || it == 13 }
                ?.run {
                    println(it)
                }
    }
}