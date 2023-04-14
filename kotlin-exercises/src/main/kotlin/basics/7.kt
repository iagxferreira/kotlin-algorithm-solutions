package basics

import java.math.BigDecimal
import java.util.*

/**
 * Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
 * sua terça parte.
 * Ex:

 * */

internal fun exercise7(){
    val scanner = Scanner(System.`in`)
    print("Digite um número: ")
    val number = scanner.nextBigDecimal()
    println("""
         O dobro de $number é ${number * BigDecimal(2)}
         A terça parte de $number é ${number / BigDecimal(3)}
    """.trimIndent())
}

internal fun main(){
    exercise7()
}