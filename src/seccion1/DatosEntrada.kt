package seccion1

fun main(args: Array<String>)
{
    print("Ingresa un nombre: ")
    val nom= readLine()//Forzosamente debe de pedirse el dato de esta manera, no se puede primero la variable y depués el reaedline

    print("Ingresa tu edad: ")
    val edad= readLine()

    println("El nombre ingresado fue: $nom")
    println("La edad ingresada fue de: $edad")
}