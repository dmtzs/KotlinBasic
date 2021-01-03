package funciones

fun main()
{
    sumar(3, 9)
    println("El resultado de la resta es: ${restar(9, 3)}")
    println("El resultado de la funcion summa es: ${summa(12, 2)}")
    println("El resultado de la función MaxNum es: ${MaxNum(15, 19)}")
    println("El resultado de la función MaxNum2 es: ${MaxNum2(15, 19)}")
}

fun sumar(a: Int, b: Int)
{
    println("La primera función de la suma es: ${a+b}")
}

fun restar(a: Int, b: Int): Int
{
    return a-b
}

fun MaxNum(num1: Int, num2: Int): Int
{
    if (num1>num2)
    {
        return num1
    }
    else
    {
        return num2
    }
}

//Funciones inline a aprtir de aquí abajo
fun summa(a: Int, b: Int): Int= a+b


fun MaxNum2(a: Int, b: Int): Int= if (a>b) a else b