package basics

import java.util.*

fun exercise12(){
    val scanner = Scanner(System.`in`)
    print("Write the product value: ")
    val value = scanner.nextDouble()
    println("The product value with discount applied is ${value * 0.95}")
}

fun main(){
    exercise12()
}