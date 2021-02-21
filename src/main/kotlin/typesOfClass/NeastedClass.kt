package typesOfClass

fun main() {

    Computer("v1.0").run {
        bootComputer()
    }

}

class Computer (var obs: String  = "") {
    var name = "Dell"

    fun bootComputer() {
        val operationSystem = OperationSystem(obs)
        operationSystem.boot()
    }

    private inner class OperationSystem (var obs: String = "") {
        private var name = "Windows"

        fun boot() {
            println(" [$obs] Booting $name System of ${this@Computer.name} computer")
        }
    }
}