package arreglos

fun main()
{
    //var arre= Array<Int>(10){1}//Una forma en la que se puede crear un arreglo pero no entiendo la última parte
    val arre1= Array<Int>(10){0}
    //Según esto es que es tipo arreglo, de tipo entero ne parentesis tamaño y de qué valores llenar inicialemnte el arreglo

    arre1[0]= 5
    arre1[1]= -5
    arre1[2]= 50
    arre1[3]= 100

    println("El arreglo en la posición 3 es: "+arre1[3])

    for (i in arre1)
    {
        println(i)
    }
    println("-------------------------")
    for (i in 0..3)
    {
        println(arre1[i])
    }

    val frutas= Array<String>(2){""}

    for (indi in 0..1)
    {
        print("Ingresa la fruta que deseas: ")
        frutas[indi]= readLine()!!
    }
    for (indi in 0..1)
    {
        println("La fruta en el índice $indi es: "+frutas[indi])
    }
}