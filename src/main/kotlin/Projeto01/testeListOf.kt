package Projeto01

fun main(){
    val joao = Funcionario("joao", 1100.0, "clt")
    val joao1 = Funcionario("joao1", 200.0, "PJ")
    val joao2 = Funcionario("joao2", 31100.0,"clt")

    val funcionarios = listOf(joao,joao1,joao2)
    funcionarios.forEach { println(it) }

    println("----------")
    println(funcionarios.find { it.nome == "joao"})
    println("----------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }
    println("----------")
    funcionarios
        .groupBy { it.tipoContrato }
        .forEach { println(it) }

}
