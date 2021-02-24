package generics

fun main () {

    saySomeThing<String>("Daniel").run {
        saySomeThing()
    }

    saySomeThing<sayObject>(sayObject("There is an object here =)"))
            .run {
                saySomeThing()
            }

    ObjectInfo<ArrayList<String>>().run {
        getInfo(arrayListOf("A","B","C"))
    }

    ObjectInfo<HashMap<String, Int>>().run {
        getInfo(hashMapOf("A" to 1,"B" to 23,"C" to 45))
    }

}

class saySomeThing <T>  (var say: T){
    fun saySomeThing (){
        println("Hello, $say")
    }
}

data class sayObject (var text: String) {

    override fun toString(): String {
        return text
    }
}

class ObjectInfo <T> () {
    fun getInfo(item: T) {
        println("Length of item is: ${item.toString()}")
    }
}