package br.com.digitalhouse.desafio2.domain

class Restaurante (val img: Int, var name:String, val end:String, val time:String) {
    override fun toString(): String {
        return "Nome: $name | Endereço: $end | Horário: $time"
    }
}