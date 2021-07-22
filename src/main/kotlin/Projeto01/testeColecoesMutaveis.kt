package Projeto01

fun main(){
    val joao = Funcionario("joao", 1100.0, "clt")
    val joao1 = Funcionario("joao1", 200.0, "PJ")
    val joao2 = Funcionario("joao2", 31100.0,"clt")

    println("--------------------LIST")
    val funcionarios = mutableListOf(joao,joao1)
    funcionarios.forEach { println(it) }
    println("--------------------")
    funcionarios.add(joao2)
    funcionarios.forEach { println(it) }
    println("--------------------SET")
    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.add(joao1)
    funcionariosSet.add(joao2)
    funcionariosSet.forEach { println(it) }
    funcionariosSet.remove(joao)
    funcionariosSet.forEach { println(it) }
}