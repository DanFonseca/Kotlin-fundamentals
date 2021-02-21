package typesOfClass

fun main() {

    val clients = arrayListOf(
            User(
                    "Daniel",
                    email = "daniel@gmail.com",
                    arrayListOf("iPhone", "airPods")
            ),

            User(
                    "Jorge",
                    email = "jorge@gmail.com",
                    arrayListOf("External HD", "Intel i7")
            ))

    val newUser = clients[1].copy(email = "daniel.new@gmail.com")
    clients.add(newUser)

    sendEmail(clients)
}

data class User(val name: String, val email: String, val productsBought: List<String>) {

}

fun sendEmail(users: ArrayList<User>) {
    users.forEach {
        println("Sending email to $it")
    }
}