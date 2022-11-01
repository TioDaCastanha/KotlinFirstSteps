package lista_exercicios

fun main() {

    val metros: Float

    print("Informe a distância em metros: ")
    metros = readln().toFloat()

    println("A distância de ${metros}m corresponde a: ")
    println("${metros / 1000}Km         ${metros * 10}dm")
    println("${metros / 100}Hm         ${metros * 100}cm")
    println("${metros / 10}Dam         ${metros * 1000}mm")
}

