package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val maria = Gerente("Maria Fulana", "11122233345", 5000.0)
    ImprimeRelatorioFuncionario.imprime(maria)
}


