package arreglos

fun main()
{
    val hashmap= HashMap<Int, String>()//Es como una tupla en python si no es mutable o un diccionario si es mutable
    //Es raro por que no puedes cambiar el primero
    //Las llaves aparentemente son inmutables, probar diferentes tipos para probarlo
    //EL valor agregado a eso si es mutable

    hashmap.put(1, "Merida")//De esta forma se agregan elementos al hashmap
    hashmap.put(2, "DF")
    hashmap.put(334, "Yucatan")
    hashmap.put(4, "Durango")

    println(hashmap[334])
    println(hashmap[4])
    hashmap[4]= "Eder"
    println(hashmap[4])

    //Una forma de recorrer el hashmap es lo siguiente:
    println("Imprimir recorriendo las llaves del hashmap")
    for (i in hashmap.keys)
    {
        println(hashmap[i])
    }
}