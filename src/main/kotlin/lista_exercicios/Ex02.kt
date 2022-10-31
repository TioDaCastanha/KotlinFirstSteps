package lista_exercicios

//É possivel utilizar bibliotecas JAVA no Kotlin
import javax.swing.JOptionPane

fun main(){
    val nome: String
    val idade: Int

    print("Digite seu nome: ")
    nome = readln()

    print("Olá $nome Seja bem vindo ao Kotlin!!")

    idade = Integer.parseInt(JOptionPane.showInputDialog("Infome sua idade: "))

    print("$nome você tem $idade anos")
}
