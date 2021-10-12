fun main()
{
    var number1= 0
    var number2= 0
    var operation : Char = '+'
    println(" enter the first number")
    number1 = readLine()!!. toInt()
    println(" enter the second number")
    number2 = readLine()!!. toInt()
    println("enter operation")
    operation = readLine()!!. single()
    when (operation){
        '+'-> add(number1, number2)
        '-'-> sub (number1, number2)
        '*'-> mult(number1, number2)
        '/'-> div(number1, number2)

    }



}
fun add(number1 : Int, number2 : Int ){
    println("$number1 + $number2 = ${number1 + number2}")

}
fun sub(number1 : Int, number2 : Int ){
    println("$number1 - $number2 = ${number1 - number2}")}

fun mult (number1 : Int, number2 : Int ) {
    println("$number1 * $number2 = ${number1 * number2}")
}

fun div (number1 : Int, number2 : Int  ) {
    println("$number1/$number2 = ${number1 / number2}")
    println("Remainder")
    println("$number1%$number2 = ${number1 % number2}")

}
