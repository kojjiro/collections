package Projeto01

fun main(){
    val salarios = arrayOf(
        "200".toBigDecimal(),
        "250".toBigDecimal(),
        "300".toBigDecimal(),
    )
    println(salarios.somatoria())
    println("-----------")
    println(salarios.media())

}