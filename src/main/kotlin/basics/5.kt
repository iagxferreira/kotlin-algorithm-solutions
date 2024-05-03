package basics

import java.math.BigDecimal
import java.util.Scanner

/**
 * Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
 * na tela a sua média na disciplina.
 * Ex:
 * Nota 1: 4.5
 * Nota 2: 8.5
 * A média entre 4.5 e 8.5 é igual a 6.5
 * */
internal fun exercise5(){
    val scanner = Scanner(System.`in`)
    print("Grade 1: ")
    val firstGrade = scanner.nextBigDecimal()
    print("Grade 2: ")
    val secondGrade = scanner.nextBigDecimal()
    val average = (firstGrade + secondGrade)/BigDecimal(2)
    print("The average between $firstGrade and $secondGrade is equal to $average")
}


internal fun main() {
    exercise5()
}
