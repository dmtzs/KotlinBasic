package seccion1

fun main(args: Array<String>)
{
    print("Calificación en variables: ")
    val varia= readLine()!!.toInt()
    print("Calificación en operaciones matemáticas: ")
    val opera= readLine()!!.toInt()
    print("Calificación en operadores lógicos: ")
    val logic= readLine()!!.toInt()
    print("Calificación de condiciones: ")
    val cond= readLine()!!.toInt()

    var promedio= (varia+opera+logic+cond)/4

    if (promedio==10)
    {
        println("Tu resultado es sobresaliente, felicidades!!. Tu calificación es: $promedio")
    }
    else if (promedio==9)
    {
        println("Tu resultado es bueno. Tu calificación es: $promedio")
    }
    else if (promedio>=6 && promedio<=8)
    {
        println("Tu resultado es suficiente. Tu calificación es: $promedio")
    }
    else
    {
        println("Tu resultado es insuficiente. Tu calificación es: $promedio")
    }
}