package fundamentals.reflections

data class ExampleDataClass(
    val name: String, var enabled: Boolean)

fun main(){
    ExampleDataClass::class.java.methods.forEach(::println)
}
