package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Lilian"
    var cpf: String = "234.567.890-11"
}

fun main() {
    val lilian = Pessoa()

    println(lilian.nome)
    println(lilian.cpf)
}