/*
    -----Suma de dos matrices 3x3 en Kotlin---
    Crear un programa que permita al usuario ingresar por teclado los valores de
    dos matrices de tamaño 3x3 y posteriormente realiza la suma de ambas matrices,
    mostrando el resultado en pantalla.

    ---Explicación del programa---
    Se crean tres matrices:
        o   matriz1 para almacenar la primera matriz.
        o   matriz2 para almacenar la segunda matriz.
        o   resultado para guardar la suma.
*/

fun main() {
    val filas = 3
    val columnas = 3
    val matriz1 = Array(filas) { IntArray(columnas) }
    val matriz2 = Array(filas) { IntArray(columnas) }
    val resultado = Array(filas) { IntArray(columnas) }

    println("--- Ingrese los valores de la PRIMERA matriz (3x3) ---")
    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            print("Ingrese el valor para la posición [$i][$j]: ")
            matriz1[i][j] = readLine()?.toIntOrNull() ?: 0
        }
    }

    println("\n--- Ingrese los valores de la SEGUNDA matriz (3x3) ---")
    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            print("Ingrese el valor para la posición [$i][$j]: ")
            matriz2[i][j] = readLine()?.toIntOrNull() ?: 0
        }
    }

    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            resultado[i][j] = matriz1[i][j] + matriz2[i][j]
        }
    }

    println("\n--- Matriz Resultante (Suma) ---")
    for (i in 0 until filas) {
        for (j in 0 until columnas) {
            print("${resultado[i][j]}\t")
        }
        println()
    }
}