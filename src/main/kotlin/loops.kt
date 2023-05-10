fun main(args: Array<String>) {
//    this is a for loop


    for (i in 5..12) {
        println("loop : $i")
    }
    val myarr = arrayOf("ab", "be", "cd", "ef", "gh")

    for (n in myarr) {
        println(n)
    }
//    this is a while loop
    var num = 10
    var num2 = 0
    while (num >= 5) {
        println("loop : $num")
        num--
    }

    var num3 = 5
//    var num4 = 15
    while (num3 <= 15) {
        println("loop : $num3")
        num3++
//    do loop?
    }
}


