package seccion1

fun main(args: Array<String>)
{
    val nom1= "Diego"
    val nom2= "Diiego"

    /*if (nom1.equals(nom2))
    {
        println("Las cadenas son iguales!!")
    }
    else
    {
        println("Las cadenas no son iguales")
    }*/
    //Otra forma de comparar que pienso es más universal como python:
    if (nom1==nom2)
    {
        println("Las cadenas son iguales!!")
    }
    else
    {
        println("Las cadenas no son iguales!!")
    }
}