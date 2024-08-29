package chandan.prasad.dayonecalci

class Simcalci(private val num1: Int, private val num2: Int) {

    // Method to calculate the sum
    fun getSum(): Int {
        return num1 + num2
    }

    // Method to calculate the sub
    fun getSub(): Int {
        return num1 - num2
    }
}

fun main() {
    println("HI I'M SUM")

    println("Enter first number : ")
    val x = readln().toInt()
    println("First number : $x")
    println("Enter the Second Number :")
    val xx = readLine()!!.toInt()
    println("Second Number : $xx")

    val tonyandsarang = Simcalci(x, xx)
    val summ = tonyandsarang.getSum()
    println("Sum of Numbers : $summ")
    val sub = tonyandsarang.getSub()
    println("Sub of Numbers : $sub")
}