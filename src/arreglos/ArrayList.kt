package arreglos

fun main()
{
    val arre= ArrayList<String>()

    arre.add("Uva")
    arre.add("Platano")
    arre.add("Kiwi")
    println("El elemento en la posición 3 es: "+arre[2])

    println("\nTodos los elementos son: ")
    for (i in arre)
    {
        println(i)
    }
    if (arre.contains("Kiwi"))//Para ver si se ecnuentra un valor dentro del arreglo
    {
        println("Se encontró kiwi")
    }
    else
    {
        println("No se encontró kiwi")
    }
    for (tama in 0..arre.size-1)//Se le debe de poner el -1 para que no intente acceder a memoria que no existe
    {
        println(arre[tama])
    }
}