package basics

import java.util.*

/**
 * Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
 * sucessor.
 * Ex:
 * Digite um número: 9
 * O antecessor de 9 é 8
 * O sucessor de 9 é 10
 * */
internal fun exercise6(){
    val scanner = Scanner(System.`in`)
    print("Write a number: ")
    val number = scanner.nextInt()
    println("""
        The antecessor of $number is ${number - 1}
        The sucessor of $number is ${number + 1}
    """.trimIndent())
}

internal fun main(){
    exercise6()
}