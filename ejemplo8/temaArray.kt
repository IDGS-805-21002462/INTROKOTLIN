fun main(){
    //numeros
    val numeros = arrayOf(1, 2, 3, 4, 5)
    println(numeros[0])

    //cadenas
    val nombres = arrayOf("ana", "luis", "carlos")
    println(nombres[1])

    //Recorrer arreglos
    val frutas = arrayOf("manzana", "pera", "uva")

    for (fruta in frutas){
        println(fruta)
    }
    val numerosVacios = Array(5){0}

    val matriz = arrayOf(
        arrayOf(1,2),
        arrayOf(3,4)
    )
    println(matriz[1][0])

}