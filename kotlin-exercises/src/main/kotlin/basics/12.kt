package basics

import java.util.*

/**
 * Crie um programa que leia o preço de um produto, calcule e mostre o seu
 * PREÇO PROMOCIONAL, com 5% de desconto.
 * */
fun exercise12(){
    val scanner = Scanner(System.`in`)
    print("Write the product value: ")
    val value = scanner.nextDouble()
    println("The product value with discount applied is ${value * 0.95}")
}

fun main(){
    exercise12()
}