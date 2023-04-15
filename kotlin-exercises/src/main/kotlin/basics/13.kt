package basics

import java.util.*

/**
 * Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
 * seu novo salário, com 15% de aumento.
 * */

internal fun exercise13(){
    val scanner = Scanner(System.`in`)
    print("Write your wage: ")
    val wage = scanner.nextDouble()
    println("Wage 15% augmented ${wage * 1.15}")
}

internal fun main(){
    exercise13()
}