package funciones

import java.lang.management.PlatformLoggingMXBean

/*El polimorfismo es cuando tenemos varias funciones iguales pero que cuyos parámetros son distintos, es decir misma función pero recibe diferente tipo de dato*/
fun Polimorf(num1: Int):Unit
{
    println("El número es: $num1")
}

fun Polimorf(num1: Double):Unit
{
    println("El número es: $num1")
}

fun Polimorf(num1: Float):Unit
{
    println("El número es: $num1")
}

fun Polimorf(cade: String):Unit
{
    println("La cadena es: $cade")
}

fun main()
{
    Polimorf(5.2f)
    Polimorf(5)
    Polimorf(2.36514654165)
    Polimorf("Diego y Ana")
}