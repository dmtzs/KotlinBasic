package arreglos

fun main()
{
    //SI queremos hacer que sea mutable el listOf()
    val nums= mutableListOf(0, 1, 2, -12, -24)//Esta inmutable
    for (i in nums)
    {
        println(i)
    }
    nums[2]= 4
    println(nums[2])

    println("De la variable inmutable")
    val inmutable= setOf(1, 2, 4, 0, 50, 50)//Nos devuelve elementos inmutables, como el listof
    //El setof eliminara los elementos duplicados
    for (i in inmutable)
    {
        println(i)
    }
    println(inmutable)
    //De igual manera como el listof se puede hacer mutable
    val mutable= mutableSetOf(1, 2, 4, 0, 50, 50)
    for (i in mutable)
    {
        println(i)
    }
    //mutable[1]=90//Al ser una lista no se puede modificar de esta manera, sin embargo se puede agregar al final
    mutable.add(89)
    for (i in mutable)
    {
        println(i)
    }
}