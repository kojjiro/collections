package Projeto01

fun main() {
    val joao = Funcionario("joao", 1100.0, "clt")
    val joao1 = Funcionario("joao1", 200.0, "PJ")
    val joao2 = Funcionario("joao2", 31100.0, "clt")

    val funcionarios1 = setOf(joao,joao1)
    val funcionarios2 = setOf(joao1,joao2)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("--------------")
    val funcionarios3 = setOf(joao,joao1,joao2)
    val resultSubrstract = funcionarios3.subtract(funcionarios2)
    resultSubrstract.forEach { println(it) }
    println("--------------")
    val resultInstersect = funcionarios3.intersect(funcionarios2)
    resultInstersect.forEach { println(it) }

}