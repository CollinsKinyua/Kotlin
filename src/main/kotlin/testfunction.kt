import kotlin.math.sqrt

fun main(args: Array<String>) {
    Hesabu()
    println(sqrt(45.20))

    Myfunction(fname = "Collins",lname=" Kinyua", Age = 22 )
    Hobbies()
}
fun Myfunction(fname:String,lname:String,Age:Int){

    println("My  name is $fname,$lname and i am $Age years old")
}

fun Hobbies(){
     println("I like coding,playing football and nature")
}