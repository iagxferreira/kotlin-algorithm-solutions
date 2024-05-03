package basics

import java.text.NumberFormat
import java.util.*

/**
 * Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
 * 80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
 * o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.
 * */
internal fun exercise17(){
    val usFormat = NumberFormat.getCurrencyInstance().apply {
        maximumFractionDigits = 2
        currency = Currency.getInstance(Locale.US)
    }
    val scanner = Scanner(System.`in`)
    print("Write the car speed: ")
    val speed = scanner.nextFloat()
    if(speed > 80) return print("""
        You're wasted, you got a
        traffic ticket of 
        ${usFormat.format((speed - 80 )* 5)}!
    """.trimIndent())
}

internal fun main(){
    exercise17()
}