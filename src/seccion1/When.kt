package seccion1

fun main(args: Array<String>) {
    val x= 16

    when(x){
        1 -> println("El valor de x es 1")//Lo que etamos diciendo aquí es que en el when, es decir, cuando x
        //entramos ahora a lo de adentro del when, en este caso indicamos que si es 1 -> hagamos algo
        2 -> {
            println("El valor es 2")
            println("Se está ejecutando una línea más por ser 2")
        }
        3 -> println("El valor es 3")
        in 5..15 -> {
            println("El valor está entre el rango 5 y 15")
            println("De igual manera se está ejecutando otra línea por ser entre el rango 5-15")
        }
        !in 5..15 -> println("De igual manera el valor no está entre el rango 5 y 15")
        else -> println("El valor esta fuera del rango definido")
    }

    val promedio= 7

    println("\nPara el promedio del ejercicio del else if")
    when (promedio){
        10 -> println("Tu resultado es sobresaliente, felicidades!!. Tu calificación es: $promedio")
        9 -> println("Tu resultado es bueno. Tu calificación es: $promedio")
        6,8 -> println("Tu resultado es suficiente. Tu calificación es: $promedio")//Indica un rango el 6,8
        else -> println("Tu resultado es suficiente. Tu calificación es: $promedio")
    }
}