package arreglos

import java.util.*

fun main() {
    val nums = listOf(1, 2, 3, 4, 5, 6)

    for (i in nums) {
        println(i)
    }
    for ((indice, elemento) in nums.withIndex())//Guarda el índice en variable indice y el elemento relacionado en elemento
    {
        println("Indice: $indice: $elemento")
    }

    val mapa = TreeMap<String, Int>()//Es de java esto, por lo tanto podríamos evitarlo de ser necesario
    mapa["Diego"] = 24
    mapa["Ana"] = 24
    mapa["Valeria"] = 23

    for ((nom, elem) in mapa) {
        println("$nom: $elem")
    }
}