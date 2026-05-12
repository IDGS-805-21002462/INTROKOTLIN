/*
* problema 3: un controlador PLC bloquea el acceso tras 3 intentos fallidos de ingresar
* una clave de seguridad
* */

fun main() {
    val claveCorrecta = "contrasenia"
    var intentosFallidos = 0
    val maxIntentos = 3

    println("Ingresa clave de seguridad, por favor")

    for (intento in 1..maxIntentos) {
        print("Intento $intento/$maxIntentos - Ingresa la clave correcta: ")
        val claveIngresada = readLine()

        if (claveIngresada == claveCorrecta) {
            println("Clave correcta. Bienvenido.")
            return
        } else {
            intentosFallidos++
            println("Clave incorrecta. Intentos fallidos: $intentosFallidos")
        }
    }

    if (intentosFallidos == maxIntentos) {
        println("\nAcceso bloqueado. Se superó el número de intentos permitidos.")
    }
}