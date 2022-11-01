package lista_exercicios

fun main(){

    val nota1: Float
    val nota2: Float

    print("Informe a Nota 1 do Aluno: ")
    nota1 = readln().toFloat()

    print("Informe a Nota 2 do Aluno: ")
    nota2 = readln().toFloat()

    val media = (nota1 + nota2)/ 2

    print(String.format("A Média entre %.2f e %.2f é: %.2f", nota1, nota2, media))

}