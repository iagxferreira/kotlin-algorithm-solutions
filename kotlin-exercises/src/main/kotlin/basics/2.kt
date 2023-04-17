package basics

import java.util.*

/**
 * Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:
 * Ex:
 * Qual é o seu nome? João da Silva
 * Olá João da Silva, é um prazer te conhecer!
 * */
internal fun exercise2(){
    val scanner = Scanner(System.`in`)
    print("What's your name? ")
    val name = scanner.nextLine()
    println("Welcome, $name!")
}

internal fun main(){
    exercise2()
}