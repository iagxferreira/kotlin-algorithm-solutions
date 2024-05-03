package basics

import java.util.*

/**
 * Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
 * segundo grau e mostre o valor de Delta.
 * */
internal fun exercise11(){
    val scanner = Scanner(System.`in`)
    print("Write the 'a' value: ")
    val a = scanner.nextInt()
    print("Write the 'b' value: ")
    val b = scanner.nextInt()
    print("Write the 'c' value: ")
    val c = scanner.nextInt()
    val delta = b * b - 4 * a * c
    println(delta)
}

internal fun main(){
    exercise11()
}