package basics

import java.util.*
import kotlin.math.pow

/**
 * Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
 * segundo grau e mostre o valor de Delta.
 * */
internal fun exercise11(){
    val scanner = Scanner(System.`in`)
    print("Write the 'a' value: ")
    val a = scanner.nextFloat()
    print("Write the 'b' value: ")
    val b = scanner.nextFloat()
    print("Write the 'c' value: ")
    val c = scanner.nextFloat()

    val delta = b.pow(2) - 4 * a * c
    val x1 = - b + (delta / 2 * a)
    val x2 = - b - (delta / 2 * a)
    println("x1 = $x1")
    println("x2 = $x2")
}

internal fun main(){
    exercise11()
}