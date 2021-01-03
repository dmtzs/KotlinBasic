package seccion1

import kotlin.reflect.typeOf

fun main(args: Array<String>)
{
    var num1= 5
    var num2= 10
    var cadenum= "19"
    var variable: Float?//Lo que hace esto es indicar que la variable puede estar vacía o no
    var suma: Int
    var otrasuma: Float

    suma= num2+cadenum.toInt()
    otrasuma= num2.toFloat() + cadenum.toInt()

    println("Suma: $suma")
    println("Otra suma: $otrasuma")
}