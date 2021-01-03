package ciclos

fun main(args: Array<String>)
{
    val nums= 1..10

    for (i in nums)
    {
        println(i)
    }

    println("-----------------------------")
    for (elem in nums step 2)//La función step es para que se vaya de 2 en 2 avanzando el for, pero se puede de más en más
    {
        println(elem)
    }

    println("-----------------------------")
    for (i in nums.reversed())//Recorre el rango pero al revés
    {
        println(i)
    }
    println("-----------------------------")
    for (i in 10 downTo 1)
    {
        println(i)
    }
    println("-----------------------------")
    for (i in 1 until 10)
    {
        println(i)
    }
}