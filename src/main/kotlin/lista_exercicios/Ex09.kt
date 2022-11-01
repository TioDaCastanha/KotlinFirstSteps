package lista_exercicios

fun main(){

    val reais: Float

    print("Quando dinheiro em R$ você possui: ")
    reais = readln().toFloat()

    print("Você pode comprar U$${reais/3.45f} com R$$reais")
}