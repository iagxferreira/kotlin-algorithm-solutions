package basics

import java.util.*

/**
 * A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
 * um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
 * quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
 * sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.
 * */
internal fun exercise14(){
    val scanner = Scanner(System.`in`)
    print("Write the amount of kilometers you have done: ")
    val kilometers = scanner.nextDouble()
    print("Write the amount of days you have rented: ")
    val days = scanner.nextInt()
    val price = days * 90 + 0.20 * kilometers
    println("Price: $price")
}

internal fun main(){
    exercise14()
}