package br.com.alura.colecoesarrayslistas.testes

fun testaInteracaoArrayIdades() {

    val idades = intArrayOf(10, 12, 25, 19, 33, 20, 55)

    //Operações agregadoras
    val maior = idades.maxOrNull()
    println("maior idade $maior")

    val menor = idades.minOrNull()
    println("menor idade $menor")

    val media: Double = idades.average()
    println("média de idades $media")

    val todosMaiores = idades.all { it > 18 }
    println("Todos maiores? $todosMaiores")

    val existeMenor = idades.any { it < 18 }
    println("Algum menor? $existeMenor")

    val maiores = idades.filter { it >= 18 }
    println("Maiores: $maiores")

    val busca = idades.find { it >= 18 }
    println("Busca: $busca")

    var maiorIdade = Int.MIN_VALUE

    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }
    println("Maior idade: $maiorIdade")

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }
    println("Menor idade: $menorIdade")
}





