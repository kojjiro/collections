package Projeto01

fun main(){
    val joao = Funcionario("joao", 1100.0, "clt")
    val joao1 = Funcionario("joao1", 200.0, "PJ")
    val joao2 = Funcionario("joao2", 31100.0,"clt")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(joao1.nome, joao1)
    repositorio.create(joao2.nome, joao2)

    println(repositorio.findById(joao.nome))
    println("---------")
    repositorio.findAll().forEach { println(it) }
    println("---------")
    repositorio.remove(joao.nome)
    repositorio.findAll().forEach { println(it) }

}