class Students(val name:String,var gender:String,val age:Int) {
//class is ablueprint of an object
//name of class in this case is students
}
class Status(val marital:String,val fees:String){

}

fun main(args: Array<String>) {
//    this is an object
    val myobj=Students("Collins","Male",22)
    val first=Students("Myrrah","Female",19)
    val third=Students("Janice","Female",20)
    val second=Status("fifty bout love","cleared",)
    val forth=Students("Enoch","Male",22)
    val one=Students("Joy","Female",21)
    println("Student name is ${myobj.name} and he is ${myobj.gender} of ${myobj.age} years old")
    println("He is ${second.marital} and has ${second.fees} his fees.")
    println("Her name is ${first.name} a ${first.gender} and is ${first.age} years old.")




}