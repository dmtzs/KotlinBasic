package ciclos

fun main(args: Array<String>)
{
    for (i in 1..5)
    {
        if (i == 3)
        {
            continue
        }
        println(i)
    }

    println("Otra forma de realizar un for anidado pero matando al padre por decir un ejemplo")
    loop@for (cont1 in 1..2)
    {
        for (cont2 in 1..5)
        {
            println("Contador1: $cont1")
            if (cont2==2)
            {
                break@loop//Termina en este caso los 2 for ya que la etiqueta inicial loop está en el for padre
            }
        }
    }
}