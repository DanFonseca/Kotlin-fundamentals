package DSL

fun main() {

    "Work Meet" meeting {
        start at 11..15
    }
}


infix fun String.meeting(block: Meeting.() -> Unit) {
    Meeting(this).block()
}

class Meeting(val name: String) {
    val start = this

    infix fun at(time: IntRange) {
        println("$name start at $time")
    }
}