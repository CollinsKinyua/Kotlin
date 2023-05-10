import java.util.Objects

class Nyari{
    var num:Int=237
    var num1:Int=273

    fun Positioning():Int{
        return num+num1
    }
    fun Magical():Int{
        return num*num1
    }
}


fun main(args: Array<String>) {
    val Object = Nyari()
    println(Object.Positioning())
    println(Object.Magical())
}