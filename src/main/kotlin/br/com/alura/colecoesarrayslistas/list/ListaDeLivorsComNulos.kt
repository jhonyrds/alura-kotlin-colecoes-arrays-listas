package br.com.alura.colecoesarrayslistas.list

import br.com.alura.list.Livro

fun main() {
    listaDeLivros
        .groupBy { it.editora ?: "Editora Desconhecida" }
        .forEach{(editora: String, livros: List<Livro>) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }
}