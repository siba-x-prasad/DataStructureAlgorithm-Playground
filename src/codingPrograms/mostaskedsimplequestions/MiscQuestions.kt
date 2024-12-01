package codingPrograms.mostaskedsimplequestions

import kotlin.math.sqrt

fun main() {
    println("Is 123 is a prime number ${checkPrimeNumber(123)}")
    println("Fact of 5 is ${factorialUsingRecursion(5)}")
    println("Fact of 5 is ${sumOfNumbersInDigit(1234)}")
}

private fun checkPrimeNumber(num: Int): Boolean {
    if (num <= 1) return false
    for (i in 2..sqrt(num.toDouble()).toInt())
        if (num % i ==0) return false

    return true
}

fun factorialUsingRecursion(input: Int): Int {
    return  if (input <= 0) 1 else (input * factorialUsingRecursion(input-1))
}

private fun sumOfNumbersInDigit(num: Int) : Int {
    return if (num <= 0) 0 else {
        val rem = num%10
        rem + sumOfNumbersInDigit(num/10)
    }
}