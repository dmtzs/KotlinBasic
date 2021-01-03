package funciones

fun suma(num1: Int, num2: Int): Int//Se ponen los parámetros dentro del parentesis y al final indicamos que nos retornara la función como tal un entero
{
    //Imagino que se puede quitar lo del valor de retorno si la función no regresa nada
    val suma= num1+num2
    return suma
}

fun Mensaje():Unit
{
    println("Hola, soy un método sin parámetros")
}

fun Resta(num1: Int, num2: Int):Unit
{
    val resta= num1-num2
    println("El resultado de la resta es: ${resta}")
}

fun main()
{
    val resul= suma(5, 4)
    println("El resultado de la suma es: ${resul}")
    Mensaje()
    Resta(5, 4)
}