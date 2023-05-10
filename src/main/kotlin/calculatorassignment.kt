fun main(args: Array<String>) {
    print("Enter first number :")
    val num1= readLine()?.toDouble()?:0.0
    print("Enter the second number")
    val num2= readLine()?.toDouble()?:0.0

    print("Enter operator (+,-,*,/")
    val op= readln()
    val majibu=when (op){
        "+" -> num1+num2
         "-" -> num2-num1

        else ->{
            println("Invalid operator")
            0.0
        }
    }
    println("$num1 $op $num2=$majibu")
    println("$num2 $op $num1=$majibu")

}