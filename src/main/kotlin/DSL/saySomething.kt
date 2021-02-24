package DSL

fun main () {

    doSomething {
        say = "Hi Daniel"
    }

}

 fun doSomething ( saySomeThing: Persona.() -> Unit){
     val per = Persona()
     per.saySomeThing()
     println(per.say)
}

class Persona (){
    var say: String = ""
}

