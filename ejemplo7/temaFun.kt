import kotlin.math.pow

fun mostrarMayor(v1: Int, v2: Int, v3: Int) {
    print("Mayor")
    if (v1 > v2 && v1 > v3)
        println(v1)
    else if (v2 > v3)
        println(v2)
    else
        println(v3)
}
fun retornarMayor2(v1: Int, v2: Int): Int {
    if (v1 > v2)
        return v1
    else
        return v2
}
fun limpiarPantalla(){
    ProcessBuilder("cmd", "/c", "cls")
        .inheritIO()
        .start()
        .waitFor()
}
fun main(){
    limpiarPantalla()
    print("ingrese primer valor:")
    val v1 = readln().toInt()
    print("ingrese segundo valor:")
    val v2 = readln().toInt()
    print("ingrese tercer valor:")
    val v3 = readln().toInt()

    println(String.format("%.2f",3.141592))
    mostrarMayor(v1, v2, v3)
}