package br.com.alura.colecoesarrayslistas.testes

import java.math.BigDecimal
import java.math.RoundingMode

fun testaInteracaoArray() {

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

    val existeMenor = idades.any {it < 18}
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

    val salarios2 = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00", "2500.00")

    println("Salários: ${salarios.contentToString()}")

    val aumento2 = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios2
        .map { salario ->
            if (salario < "5000".toBigDecimal()) {
                salario + "500".toBigDecimal()
            }else{
                (salario * aumento2).setScale(2, RoundingMode.UP)
            }
        }
        .toTypedArray()
    println("Salários com aumento: ${salariosComAumento.contentToString()}")
}

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}