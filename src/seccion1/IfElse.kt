package seccion1

fun main(args: Array<String>)
{
    print("Ingresa un sueldo: ")
    val sueldo= readLine()!!.toDouble()

    if (sueldo>1000)
    {
        print("Debe de pagar impuestos!!")
    }
    else {
        print("No debe de pagar impuestos!!")
    }
}