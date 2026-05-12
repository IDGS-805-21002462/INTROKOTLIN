/*
* crear un programa que permita calcular el área de 4 figuras utilizando funciones
* para cada figura, mostrara un menu para elegir la figura a calcular el área, pedirá
* los valores necesarios y mostrara el resultado, a continuación, mostrara nuevamente
* el menú termina al elegir opción
* */

import kotlin.math.PI

fun areaCuadrado(lado: Double): Double {
    return lado * lado
}

fun areaRectangulo(base: Double, altura: Double): Double {
    return base * altura
}

fun areaTriangulo(base: Double, altura: Double): Double {
    return (base * altura) / 2
}

fun areaCirculo(radio: Double): Double {
    return PI * radio * radio
}

fun main() {
    var opcion: Int

    do {
        println("----- Elige la figura a calcular el área -----")
        println("1. Cuadrado")
        println("2. Rectángulo")
        println("3. Triángulo")
        println("4. Círculo")
        println("5. Salir")
        print("Elija una opción: ")

        opcion = readLine()?.toIntOrNull() ?: 0

        when (opcion) {
            1 -> {
                print("Ingrese lado del cuadrado: ")
                val lado = readLine()?.toDoubleOrNull() ?: 0.0
                if (lado > 0) {
                    println("El área del cuadrado es: ${areaCuadrado(lado)}")
                } else {
                    println("Valor no válido.")
                }
            }
            2 -> {
                print("Ingrese la base del rectángulo: ")
                val base = readLine()?.toDoubleOrNull() ?: 0.0
                print("Ingrese la altura del rectángulo: ")
                val altura = readLine()?.toDoubleOrNull() ?: 0.0
                if (base > 0 && altura > 0) {
                    println("El área del rectángulo es: ${areaRectangulo(base, altura)}")
                } else {
                    println("Valores no válidos.")
                }
            }
            3 -> {
                print("Ingrese la base del triángulo: ")
                val base = readLine()?.toDoubleOrNull() ?: 0.0
                print("Ingrese la altura del triángulo: ")
                val altura = readLine()?.toDoubleOrNull() ?: 0.0
                if (base > 0 && altura > 0) {
                    println("El área del triángulo es: ${areaTriangulo(base, altura)}")
                } else {
                    println("Valores no válidos.")
                }
            }
            4 -> {
                print("Ingrese el radio del círculo: ")
                val radio = readLine()?.toDoubleOrNull() ?: 0.0
                if (radio > 0) {
                    println("El área del círculo es: ${areaCirculo(radio)}")
                } else {
                    println("Valor no válido.")
                }
            }
            5 -> println("Adios...")
            else -> println("Opción no válida. Inténtelo nuevamente.")
        }
        println()
    } while (opcion != 5)
}