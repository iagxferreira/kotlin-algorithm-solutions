package basics

import java.util.*

/**
 * Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
 * média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
 * não um bom aproveitamento (se ficou acima da média 7.0).
 * */
internal fun exercise19(){
    val scanner = Scanner(System.`in`)
    print("Write your name: ")
    val name = scanner.nextLine()
    print("Write your first grade: ")
    val firstGrade = scanner.nextFloat()
    print("Write your second grade: ")
    val secondGrade = scanner.nextFloat()
    val average = (firstGrade + secondGrade)/2
    if(average >= 7) return println("Well done $name! Your grade is $average")
    println("Sorry $name, try again later to improve your skills!")
}

internal fun main(){
    exercise19()
}