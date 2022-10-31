package lista_exercicios

fun main (){

    val num1: Int
    val num2: Int

    print("Informe um numero: ")
    num1 = readln().toInt()
    print("Informe outro numero: ")
    num2 = readln().toInt()

    val soma = num1 + num2

    print("A soma entre $num1 e $num2 é $soma")

}