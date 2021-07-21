package Projeto01

fun main(){
    val values = intArrayOf(2,5,8,6,11)

    values.forEach {
        println(it)
    }
    println("--------------")
    values.sort()
    values.forEach {
        println(it)
    }
}