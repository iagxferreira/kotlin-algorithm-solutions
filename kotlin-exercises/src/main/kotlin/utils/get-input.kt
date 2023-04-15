package utils

import java.util.*


enum class Type {
    BIGDECIMAL,
    FLOAT,
    STRING,
    INT
}


fun getInput(message: String, type: Type): Any? {
    val scanner = Scanner(System.`in`)

    val executionMap = hashMapOf<Type, () -> Any>(
        Type.INT to { scanner.nextInt() },
        Type.BIGDECIMAL to { scanner.nextBigDecimal() },
        Type.STRING to { scanner.nextLine() },
        Type.FLOAT to { scanner.nextFloat() }
    )

    print(message)
    return executionMap[type]?.invoke()
}

fun main(){
    val int = getInput("Get integer input: ", Type.STRING)
    println(int)
    println(int!!::class)
}