package seccion1

fun main(args: Array<String>)
{
    print("Ingresa el primer número: ")
    val num1= readLine()!!.toInt()
    print("Ingresa el segundo número: ")
    val num2= readLine()!!.toInt()

    val resul= num1+num2
    println("El resultado de la suma es: $resul")
}