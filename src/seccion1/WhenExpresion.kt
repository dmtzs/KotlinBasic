package seccion1

fun main(args: Array<String>) {

    val promedio= 7
    val resul= when (promedio){
        10 -> "Tu resultado es sobresaliente, felicidades!!. Tu calificación es: $promedio"
        9 -> "Tu resultado es bueno. Tu calificación es: $promedio"
        6,8 -> "Tu resultado es suficiente. Tu calificación es: $promedio"//Indica un rango el 6,8
        else -> "Tu resultado es suficiente. Tu calificación es: $promedio"
    }

    println(resul)
}