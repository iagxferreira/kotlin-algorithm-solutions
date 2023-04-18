package basics

import java.util.*

/**
 * Faça um algoritmo que pergunte a distância que um passageiro deseja
 * percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para
 * viagens até 200Km e R$0.45 para viagens mais longas.
 * */

internal fun exercise24(){
    val scanner = Scanner(System.`in`)
    print("Write the distance: ")
    val distance = scanner.nextFloat()
    when {
        distance <= 200 -> println("Fuel price: ${distance * 0.50}")
        else -> println("Fuel price: ${distance * 0.45}")
    }

}

fun main(){
    exercise24()
}