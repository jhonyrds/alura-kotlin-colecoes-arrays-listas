package br.com.alura.colecoesarrayslistas.list

fun main() {
    val prateleira = Prateleira(genero= "Literatura", livros = listaDeLivros)

    val organizarPorAutor = prateleira.organizarPorAutor()
    val organizarPorAnoPublicacao = prateleira.organizarPorAnoPublicacao()

    organizarPorAutor.imprimeComMarcadores()
    organizarPorAnoPublicacao.imprimeComMarcadores()
}