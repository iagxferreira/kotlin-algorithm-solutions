package basics

import java.util.*

/**
 * Faça um algoritmo que leia a largura e altura de uma parede, calcule e
 * mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
 * sabendo que cada litro de tinta pinta uma área de 2metros quadrados.
 * */

internal fun exercise10(){
    val scanner = Scanner(System.`in`)
    print("Write the wall width: ")
    val width = scanner.nextFloat()
    print("Write the wall height: ")
    val height = scanner.nextFloat()
    val area = width * height
    print("Com a area $area voce pode pintar um total de ${area/2}m2")
}

fun main(){
    exercise10()
}