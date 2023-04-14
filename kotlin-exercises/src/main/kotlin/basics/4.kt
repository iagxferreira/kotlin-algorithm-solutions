package basics

import java.util.*

/**
 * Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
 * entre eles.
 * Ex:
 * Digite um valor: 8
 * Digite outro valor: 5
 * A soma entre 8 e 5 é igual a 13.
 * */

internal fun exercise4(){
    val scanner = Scanner(System.`in`)
    print("Send a value: ")
    val firstNumber = scanner.nextInt()
    print("Send another value: ")
    val secondNumber = scanner.nextInt()
    print("The sum between $firstNumber and $secondNumber is equal to ${firstNumber + secondNumber}")
}

internal fun main(){
    exercise4()
}
