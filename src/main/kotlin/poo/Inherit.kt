fun main () {

//protected : acesso  para as classes filhas
//private: acesso  para o escopo da classe atual
//internal: acesso para classes do mesmo pacote

    val bentivii  = bentiVi ()
    bentivii.mustBeImplemented()
    bentivii.test()

}

 abstract class Bird {
    open var name = "Bird"
    open var speed = 100

    protected open fun helloBird () {
        println("Hello, $name, speed: $speed")
    }

      fun test () : String {
        return "tested"
     }

     abstract  fun mustBeImplemented ()
}

class bentiVi () : Bird() {
    override var name: String = "Bentivi"
    override var speed: Int = 500

    override fun mustBeImplemented() {
        println("mustBeImplemented function implemented")
    }

    fun test (teste: String) : String {
        return "return $teste"
    }

    fun sayHello() {
        helloBird()
        println("This func ovverrided is not  necessary")
        println("super ${super.speed} ${super.name}")
    }
}