package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val lilian = Pessoa(nome = "Lilian Parreiras", cpf = "11122233345")
    println(lilian.nome)
    println(lilian.cpf)

    val joao = Funcionario("Lilian Parreiras", "11122233345", BigDecimal.valueOf(2000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}


