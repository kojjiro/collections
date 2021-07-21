package Projeto01

fun main(){
    val nomes = Array(size = 3) {""}
    nomes[0]= "Jose"
    nomes[1]="Ana"
    nomes[2]="Pedro"

    for (nome in nomes){
        println(nome)
    }

    println("-------------")

    nomes.sort()
    nomes.forEach { println(it) }


    val nomes2 = arrayOf("Gui","Ellen","Emanuel")
    println("-------------")
    nomes2.sort()
    nomes2.forEach { println(it) }



}