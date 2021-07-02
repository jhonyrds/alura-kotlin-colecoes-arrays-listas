package br.com.alura.colecoesarrayslistas.testes

fun testaInteracaoArray() {
    val idades = intArrayOf(25, 19, 33, 20, 55)

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

    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)

    val aumento: Double = 1.1
    var indice: Int = 0

//    for (indice in salarios.indices) {
//        salarios[indice] = salarios[indice] * aumento
//    }
//
//    println(salarios.contentToString())

    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }

    println(salarios.contentToString())
}