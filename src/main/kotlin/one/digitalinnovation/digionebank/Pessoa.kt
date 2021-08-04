package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Lilian"

    var cpf: String = "234.567.890-11"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val lilian = Pessoa()


    println(lilian.pessoaInfo())
}