package otherConcepts

fun main () {

    Country().apply {
        //setName("Brazil")
        println(nameCountry)
    }

}

class Country () {
     lateinit var nameCountry: String

    fun setName (name: String){
        this.nameCountry = name
    }
}