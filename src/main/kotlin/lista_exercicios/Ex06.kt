package lista_exercicios

fun main (){

    val num: Int

    print("Digite um numero: ")
    num = readln().toInt()

    println("O Antecessor de $num é: ${num-1}")
    print("O Sucessor de $num é: ${num+1}")

}