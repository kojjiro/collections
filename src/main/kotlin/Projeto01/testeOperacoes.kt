package Projeto01

fun main(){
    val salarios = doubleArrayOf(100.0,200.0,300.0,400.0)

    for (salario in salarios){
        println(salarios)
    }

    println("-----------")

    println("Maior: ${salarios.maxOrNull()}")
    println("Menor: ${salarios.minOrNull()}")
    println("Media: ${salarios.average()}")
    println("-----------")
    val maiorque200 = salarios.filter { it > 200 }
    maiorque200.forEach { println(it) }
    println("-----------")
    println(salarios.find { it == 200.0 })
    println(salarios.find { it == 201.0 })
    println("-----------")
    println(salarios.any { it == 200.0 })
    println(salarios.any { it == 201.0 })

}