package one.digitalinnovation.digionebank
import java.math.BigDecimal

data class Analista(
    nome: String,
    cpf: String,
    salario:Double
):Funcionario(nome, cpf, sal){
    override fun calculoAuxilio() = (salario * 0.1)
}