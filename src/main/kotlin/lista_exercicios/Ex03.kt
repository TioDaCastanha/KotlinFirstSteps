package lista_exercicios

fun main(){

    val nome: String
    val salario: Float

    print("Informe nome do Funcionário: ")
    nome = readln()
    print("Informe o salário do funcionário: ")
    salario = readln().toFloat()

    //Usar String.format() para ajustar casas decimais
    print(String.format("O funcionário $nome tem um salário de R$%.2f em Junho", salario))
}