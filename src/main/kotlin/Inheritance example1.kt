open class Animal(colour: String, age: Int) {
    init {
        println("Color is: $colour.")
        println("Age is: $age")
    }
}

class Wolf(colour: String, age: Int): Animal(colour, age) {

    fun howls() {
        println("The Wolf howls")
    }
}
class Lion(colour: String, age: Int): Animal(colour, age) {

    fun roars() {
        println("The Lion roars")
    }
}

class Horse(colour: String, age: Int): Animal(colour, age) {

    fun neigh() {
        println("Horse makes sound of neigh")
    }
}

fun main(args: Array<String>) {
    val d = Wolf("Dark gray",2)
    d.howls()
    val l = Lion("Brown", 3)
    l.roars()
    val h = Horse("Black", 7)
    h.neigh()
}