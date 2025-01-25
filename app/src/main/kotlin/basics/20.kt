package basics

import java.util.*

/**
 * Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou ÍMPAR.
 * */
internal fun exercise20(){
    val scanner = Scanner(System.`in`)
    print("Write a number: ")
    val number = scanner.nextInt()
    if(number % 2 == 0) return println("This number is pair.")
    println("This number is odd.")
}

internal fun main(){
    exercise20()
}