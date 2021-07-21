package Projeto01

fun main(){
    val salarios  = DoubleArray( 3  )
    salarios[0]=1000.0
    salarios[1]=100.0
    salarios[2]=500.0

    salarios.forEach { println(it) }

    println("----------------")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario*1.1
    }
    salarios.forEach { println(it) }

}