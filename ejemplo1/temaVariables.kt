fun main (){
    val saludo: String = "Hola" //Inmutable
    var nombre: String = "DIEGO" // Mutable
    println("$saludo, $nombre!!!")

    println("ingresa el primer numero")
    val num1 = readln().toInt()

    println("ingresa el segundo numero")
    val num2 = readln().toInt()

    val res = num1 + num2

    println("la suma es $res")

}