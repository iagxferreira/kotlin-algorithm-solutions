package basics

import java.util.*

/**
 * Escreva um programa para calcular a redução do tempo de vida de um
 * fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
 * já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
 * quantos dias de vida um fumante perderá e exiba o total em dias.
 * */
internal fun exercise16(){
    val scanner = Scanner(System.`in`)
    print("Write the number of smoked cigarettes by day: ")
    val cigarettes = scanner.nextInt()
    print("Write the number of years you have smoked: ")
    val years = scanner.nextInt()
    val cigarettesPerDay = (cigarettes * 10 * 365 * years) / (24 * 6)
    print("Day time wasted $cigarettesPerDay")
}

internal fun main(){
    exercise16()
}