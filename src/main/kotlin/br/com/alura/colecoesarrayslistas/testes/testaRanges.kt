package br.com.alura.colecoesarrayslistas.testes

fun testaRanges() {
    //range 1 a 10
    val serie: IntRange = 1.rangeTo(10)
    for (s in serie) {
        print("$s ")
    }

    println()

    //0 a 100 step 2 em 2
    val numerosPares = 0..100 step 2
    for (numeroPar in numerosPares) {
        print("$numeroPar ")
    }

    println()

    //100 a 0 step 2 em 2
    val numerosParesReversos = 100 downTo 0 step 2
    numerosParesReversos.forEach { print("$it ") }

    println()

    //checa se o valor está dentro do intervalo
    val intervalo = 1500.0..5000.0
    val salario = 5000.1
    if (salario in intervalo) {
        println("Está dentro do intervalo")
    } else {
        println("Está fora do intervalo")
    }

    //verifica se uma letra está no alfabeto
    val alfabeto = 'a'..'z'
    val letra = 'k'
    println(letra in alfabeto)
}