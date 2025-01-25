package basics

import java.time.Year
import java.util.*

/**
 * Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
 * situação em relação ao alistamento militar.
 *  - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
 * alistamento.
 *  - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
 * alistamento.
 * */
internal fun exercise22(){
    val scanner = Scanner(System.`in`)
    print("Write your birth year: ")
    val year = scanner.nextInt()
    val age = Year.now().value - year
    if(age >= 18) return println("It's been ${age - 18} years since your enlistment")
    return println("${18 - age} years until your enlistment")
}

fun main(){
    exercise22()
}