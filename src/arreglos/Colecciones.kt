package arreglos

fun main()
{
    val otrohashmap= hashMapOf(1 to "Diego", 2 to "Valeria", 67 to "Ana")
    otrohashmap.put(79, "Hola")
    println(otrohashmap[79])

    for (i in otrohashmap.keys)
    {
        println(otrohashmap[i])
    }

    println("----------------------")
    val letras= arrayOf("a", "b", "c")//Esta es mutable
    println(letras[1])
    letras[1]= "z"//Se puede hacer debido a la mutabilidad
    println(letras[1])

    val nums= listOf(0, 1, 2, -12, -24)//Esta inmutable
    for (i in nums)
    {
        println(i)
    }
    //nums[3]= 9//Nos regresa error si lo descomentamos debido a la inmutabilidad

    println("Coleccion de nombres y edades")
    val parejas= hashMapOf<Int, String>(1 to "Ana y Diego", 2 to "Valeria y Diego")
    //Si se le intenta poner string a la llave no guarda todo lo que deseo, debe de ser un entero si o si
    for (prin in parejas.keys)
    {
        println("$prin: ${parejas[prin]}")
    }
}