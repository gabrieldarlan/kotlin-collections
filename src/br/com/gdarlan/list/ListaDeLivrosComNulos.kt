package br.com.gdarlan.list

fun main() {
    listaDeLivros
        .groupBy { it.editora ?: "Editora Desconhecida" }
        .forEach { (editora, livros) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }
}