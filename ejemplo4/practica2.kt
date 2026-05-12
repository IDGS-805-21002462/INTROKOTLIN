/*
* problema 2: una bateria comienza con \(0\%\) de carga. un cargador añade\(15\%\) cada
* minuto. se debe de detener el ciclo cuando la carga llegue o supere el \(100\%\).
* */

fun main() {
    var carga = 0
    var minutos = 0

    println("Iniciando la carga de la batería...")

    while (carga < 100) {
        carga += 15
        minutos++
        val cargaActual = if (carga > 100) 100 else carga
        println("Minuto $minutos: Cargado al $cargaActual%")
    }

    println("\nCarga completa en $minutos minutos.")
}