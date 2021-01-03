package seccion1

fun main(args: Array<String>)
{
    val nom: String?//Significa que este dato puede estar vacía o no (null)

    nom= null
    print("Ingresa la edad: ")
    val edad= readLine()!!//De esta manera es para obligar que se necesita este valor, si no se manad nada aparentemente
    //se agrega una cadena vacía.
    println(nom)
    println("La edad ingresada fue de: $edad")
}