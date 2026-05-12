fun main(parametro: Array<String>){
    print("ingrese cordenada del punto x: ")
    val x = readln().toInt()
    print("ingrese cordenada del punto y: ")
    val y = readln().toInt()
    when{
        x > 0 && y > 0 -> println("El punto se encuentra en el primer cuadrante")
        x < 0 && y > 0 -> println("El punto se encuentra en el segundo cuadrante")
        x < 0 && y < 0 -> println("El punto se encuentra en el tercer cuadrante")
        x > 0 && y < 0 -> println("El punto se encuentra en el cuarto cuadrante")

        else -> println("El punto se encuentra en un eje")
    }
}