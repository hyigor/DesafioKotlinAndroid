package br.com.digitalhouse.desafio2.domain

class Receita (val imagem: Int, var name:String, val desc:String) {
    override fun toString(): String {
        return "Nome: $name | Descrição: $desc"
    }
}