package basics

import java.util.*

/**
 * Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
 * para todos, mas especialmente para mulheres.
 * Faça um programa que leia nome,
 * sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
 * que:
 *  - Homens ganham 5% de desconto
 *  - Mulheres ganham 13% de desconto
 * */

internal fun exercise23(){
    val scanner = Scanner(System.`in`)
    print("Write your name: ")
    val name = scanner.nextLine()
    print("Write biologic gender: ")
    val gender = scanner.nextLine()
    print("Write your full price: ")
    val price = scanner.nextFloat()
    when(gender.lowercase(Locale.getDefault())) {
        "m" -> println("$name, you got a discount, your price is now: ${price * (1 - 0.05)}")
        "f" -> println("$name, you got a special discount, your price is now: ${price * (1 - 0.13)}")
    }
}

internal fun main(){
    exercise23()
}