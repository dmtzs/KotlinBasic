package ciclos

fun main(args: Array<String>)
{
    print("Ingresa hasta donde quieres que llegue el cuadrado: ")
    val inter= readLine()!!.toInt()

    for (i in 0..inter)
    {
        for (j in 0..inter)
        {
            print(" *")
        }
        println()
    }
}