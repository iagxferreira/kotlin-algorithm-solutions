package basics

import java.text.NumberFormat
import java.util.*
import java.util.Locale.Builder
const val DOLLAR_MULTIPLIER = 3.45


/**
 * Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
 * e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.
 * */
internal fun exercise9(){

    val usFormat = NumberFormat.getCurrencyInstance().apply {
        maximumFractionDigits = 2
        currency = Currency.getInstance(Locale.US)
    }

    val brFormat = NumberFormat.getCurrencyInstance().apply {
        maximumFractionDigits = 2
        currency = Currency.getInstance(Builder().setLanguage("pt").setRegion("BR").build())
    }

    val scanner =  Scanner(System.`in`)
    print("Write the money amount: ")
    val money = scanner.nextDouble()
    println("With R$ ${brFormat.format(money)} you could buy ${usFormat.format(money * DOLLAR_MULTIPLIER)}")
}

internal fun main(){
    exercise9()
}