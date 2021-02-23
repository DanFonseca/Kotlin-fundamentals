package collections
fun main () {
    val items = arrayListOf("iPhone","Book","Keyboard","Tablet", "Pencil", "Eraser")
    var removeItens = arrayListOf("iPhone", "Tablet")
    items.removeAll(removeItens)
    println(items)
    println(items[1])
    println(items.contains("iPhone"))

    //replace elemnt
    items.set(0, "macBook")
    println("item repleced  $items")

    //sublist
    println(items.subList(1,3))
    println(items.subList(1,3)::class.java) // reutnr type of class

    //clear all items in list
    items.clear()
    println(items)
    println(items.isEmpty())
}