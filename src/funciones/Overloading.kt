package funciones

fun suma2(num1: Int, num2: Int): Int//Como la funcion suma está ya dentro del mismo paquete debemos cambiar de nombre
{
    val suma= num1+num2
    return suma
}

fun suma2(num1: Int, num2: Int, num3: Int): Int//Como la funcion suma está ya dentro del mismo paquete debemos cambiar de nombre
{
    val suma= num1+num2+num3
    return suma
}

fun suma2(num1: Int, num2: Int, num3: Int, num4: Int): Int//Como la funcion suma está ya dentro del mismo paquete debemos cambiar de nombre
{
    val suma= num1+num2+num3+num4
    return suma
}


fun main()
{
    var resul= suma2(5, 7)
    println("El resultado de esta suma es: ${resul}")
    resul= suma2(5, 7, 3, 5)
    println("El resultado de esta suma es: ${resul}")
}