open class Wazazi{
    val mama="She likes cooking."
    val Dad="He likes watching football."
}
//using 'open' makes the class a parent-inheritance
class boy:Wazazi(){
    fun mvulana(){
        println(Dad)
    }

}

class  girl:Wazazi(){
    fun msichana(){
        println(mama)
    }

}
class child:Wazazi(){
    fun it(){
        println(mama)
        println(Dad)
    }
}




fun main(args: Array<String>) {
    val objboy=boy()
    objboy.mvulana()
    val objgirl=girl()
    objgirl.msichana()
    val objchild=child()
    objchild.it()
}