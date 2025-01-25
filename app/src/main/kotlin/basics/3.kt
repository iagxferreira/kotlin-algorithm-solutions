package basics

import java.math.BigDecimal
import java.text.NumberFormat
import java.util.*


/**
 * Crie um programa que leia o nome e o salário de um funcionário, mostrando no
 * final uma mensagem.
 * Ex:
 * Nome do Funcionário: Maria do Carmo
 * Salário: 1850,45
 * O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.
 */
internal class Employee(
    val name: String,
    val wage: BigDecimal
)

internal fun exercise3(){
    val scanner = Scanner(System.`in`)

    print("Name: ")
    val name = scanner.nextLine()
    print("Wage: ")
    val wage = scanner.nextBigDecimal()
    val employee = Employee(name, wage)

    val format = NumberFormat.getCurrencyInstance().apply {
        maximumFractionDigits = 2
        currency = Currency.getInstance("EUR")
    }

    val formattedWage = format.format(employee.wage)

    println("""
        Employee
        Name: ${employee.name}
        Wage: ${formattedWage}
        The employee ${employee.name} has a wage of ${formattedWage}
    """.trimIndent())
}

internal fun main(){
    exercise3()
}