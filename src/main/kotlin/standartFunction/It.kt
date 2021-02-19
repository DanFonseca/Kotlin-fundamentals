package standartFunction

fun main() {

    //listOfAnimalsExample()

    val names = stopByWord()

    names.forEach {
        it?.let {
            println(it)
        }
    }
}

fun readLineExample() {
    val input = readLine()

    input?.let {
        println("To Int ${it.toInt()}")
        println("To Double ${it.toDouble()}")
    }
}

fun listOfAnimalsExample() {
    val animals = arrayListOf<String?>()
    for (i in 1..3) {
        readLine()?.let {
            if (it.isEmpty()) {
                animals.add(null)
            } else {
                animals.add(it)
            }
        }
    }

    animals.forEach {
        it?.let { // este bloco só irá ser executado se o it for != de null
            println("Feeding the animal: $it")
        }
    }
}

fun stopByWord(): List<String?> {
    val names = arrayListOf<String?>()

    while (true) {
        readLine()?.let {

            if (it.toLowerCase() == "stop")
                return names

            if (it.isEmpty()) {
                names.add(null)
            } else {
                names.add(it)
            }
        }

    }
}