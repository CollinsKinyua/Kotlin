//parent/superclass
open class Shape{
    open fun draw(){
        println("Drawing Shape")
    }

}
//child/sub classes
class Circle:Shape(){
    override fun draw() {
        println("Drawing a Circle")
    }
}
class Square:Shape(){
    override fun draw() {
        println("Drawing a Square")
    }

}
class Triangle:Shape(){
    override fun draw() {
        println("Drawing a Triangle")
    }


}

fun main(args: Array<String>) {
    val Shapes:Array<Shape> = arrayOf(Circle(),Square(),Triangle())
    for (Shape in Shapes)
        Shape.draw()
}