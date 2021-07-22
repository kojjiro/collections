package Projeto01

fun main(){
    val pair: Pair<String, Double> = Pair("Joao",1000.0)
    val map1= mapOf(pair)

    map1.forEach { (k, v) -> println("Chave: $k Valor: $v") }

    val map2= mapOf(
        "Pedro" to 250.0,
        "Maria" to 300.0
    )

    map2.forEach { (K, V) -> println("Chave: $K Valor: $V") }

}