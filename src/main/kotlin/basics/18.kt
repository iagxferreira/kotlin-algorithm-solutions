package basics

import java.time.Year
import java.util.*

/**
 * Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
 * dela e depois mostre se ela pode ou não votar.
 * */
internal fun exercise18(){
    val scanner = Scanner(System.`in`)
    print("Write your birth year: ")
    val birthYear = scanner.nextInt()
    println("You're ${Year.now().value - birthYear}yo")
}

internal fun main(){
    exercise18()
}