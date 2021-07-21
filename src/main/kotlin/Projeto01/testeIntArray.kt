package Projeto01

fun main(){
    val values = IntArray(size = 5)
    values[0]= 4
    values[1]= 3
    values[2]= 2
    values[3]= 5
    values[4]= 1

    for (valor in values){
        println(valor)
    }

    println("-------------------")
    values.forEach { valor ->
        println(valor)
    }
    println("-------------------")
    for (index in values.indices){
        println(values[index])
    }
    println("-------------------")
    values.sort()
    for (valor in values){
        println(valor)
    }

}