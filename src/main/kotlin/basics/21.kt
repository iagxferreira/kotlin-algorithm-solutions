package basics

import java.util.Scanner

/**
 * Faça um algoritmo que leia um determinado ano e mostre se ele é ou não BISSEXTO.
 * */
internal fun exercise21(){
    val scanner = Scanner(System.`in`)
    print("Write a year number: ")
    val year = scanner.nextInt()
    if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0 )) return println("The year $year is leap")
    return println("The year $year isn't leap")
}

internal fun main(){
    exercise21()
}