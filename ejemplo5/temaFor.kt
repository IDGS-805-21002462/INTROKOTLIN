/*
* definicion de rangos
* val unDigito = 1 ... 9
* val letras = 'a' ... 'z'
*
* val docena = 1 ... 12
* if (5 docena)
*   println ("el numero 5 esta en el rango de docena")
*
* if (18 !in docena)
*   println("el 18 no esta en el rango de docena")
* */

fun main(){
    for (i in 1..10)
        print(i)
    for (i in 1..10 step 2)
        print(i)
    for (i in 10 downTo 1)
        print(i)
    for (i in 10 downTo 1 step 2)
        print(i)
}