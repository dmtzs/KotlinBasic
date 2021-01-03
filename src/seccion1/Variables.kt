package seccion1

fun main(args: Array<String>)
{
    /*Las variables var son variables, para val es una constante*/
    var x: Int= 2
    var y: Int= 8
    var z: Int= x+y
    var nom: String= "Diego"
    val edad: Int= 24
    var ciudad: String= "Ciudad de México"
    var doble: Double= 2.199191//mas digitos puede almacenar
    var flotante: Float= 23.12f/*Se le debe poner la f al final aparentemente, solo almacena hasta 7 u 8 dígitos*/

    println("El valor de z es: "+z)
    println("Nombre: "+nom)
    println("Edad: $edad")
    println("Ciudad: $ciudad")
}