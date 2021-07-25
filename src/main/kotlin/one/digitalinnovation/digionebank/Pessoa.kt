package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Israel"
    var cpf: String = "123.456.789-10"
    private set
}

fun main() {
    val Israel = Pessoa()

    

    println(Israel.nome)
    println(Israel.cpf)
}