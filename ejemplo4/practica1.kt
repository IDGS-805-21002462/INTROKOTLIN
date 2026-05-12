/*
* problema 1: Se solicita a un usuario el diametro de una tuberia, no se permiten valores negativos o cero. El programa debe de
* pedir el dato repetidamente hasta que el usuario ingrese un valor valido
* */

fun main() {
    var diametro: Double

    do {
        print("Ingrese el diametro de la tubería (solo valores positivos): ")
        val input = readLine()
        diametro = input?.toDoubleOrNull() ?: 0.0

        if (diametro <= 0) {
            println("Error: El diametro debe ser un numero positivo. Inténtelo nuevamente.")
        }
    } while (diametro <= 0)

    println("El diametro ingresado es: $diametro")
}