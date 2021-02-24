package DSL

fun main() {

    myRobot {
        it turns left
        it turns right
        it run 500
    }
}

fun myRobot(block: Robot.(Robot) -> Unit) {
    val robot = Robot()
    Robot().block(robot)
}

class Robot {
    val left = "left"
    val right = "right"
    val speed = 0

    infix fun turns(direction: String) {
        println("Turning $direction")
    }

    infix fun run(speed: Int) {
        println("Running at $speed /km")
    }

}