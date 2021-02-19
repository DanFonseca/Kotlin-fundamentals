package standartFunction

fun main() {

//    var unlockedvar = Lock().unlock(
//            Key().apply {
//                secretKey = "1236"
//            }
//    )

    readLine()?.let { str ->
        coffeeShop()
                .apply {
                    prepareCOffee(
                            Client(str)
                    )
                }
    }
            .also {
                println("Coffee is done!!")
            }

}


class Lock {
    fun unlock(key: Key) {
        println("Unlocked with key ${key.secretKey}")
    }
}

class Key {
    var secretKey: String = ""
}

class coffeeShop() {

    fun prepareCOffee(client: Client) {
        println("Preparing coffee to client ${client.name}")
    }
}

class Client(var name: String) {

}

