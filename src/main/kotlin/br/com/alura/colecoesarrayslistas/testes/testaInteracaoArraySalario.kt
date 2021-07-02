package br.com.alura.colecoesarrayslistas.testes

import br.com.alura.colecoesarrayslistas.bigDecimalArrayOf
import br.com.alura.colecoesarrayslistas.calculaAumentoRelativo
import br.com.alura.colecoesarrayslistas.media
import br.com.alura.colecoesarrayslistas.somatoria
import java.math.BigDecimal
import java.math.RoundingMode

fun testaInteracaoArraySalario() {
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
            calculaAumentoRelativo(salario, aumento2)
        }
        .toTypedArray()
    println("Salários com aumento: ${salariosComAumento.contentToString()}")

    val gastoInicial = salariosComAumento.somatoria()
    println(gastoInicial)

    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println("Gasto total: $gastoTotal")


    val mediaTresMaioresSalarios = salariosComAumento
        .sorted() //ordenar os itens
        .takeLast(3) // pegar os 3 últimos
        .toTypedArray() // transformar em um tipo array
        .media() // fazer a média
    println("Média dos três maiores salários: $mediaTresMaioresSalarios")

    val mediaMenoresSalarios = salariosComAumento
        .sorted()
        .take(3) //pega os 3 primeiros elementos
        .toTypedArray()
        .media()
    println("Média dos três menores salários $mediaMenoresSalarios")
}