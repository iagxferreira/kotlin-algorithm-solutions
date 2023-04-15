package basics

import java.util.Scanner

/**
 * Crie um programa que leia o número de dias trabalhados em um mês e mostre o
 * salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
 * por hora trabalhada.
 * */

internal fun exercise15(){
    val scanner = Scanner(System.`in`)
    print("Write the number of worked days: ")
    val days = scanner.nextInt()
    val wage = days * 25
    println("Wage: $wage")
}

internal fun main(){
    exercise15()
}