package Lesson_2

fun main() {

    val crystals = 7
    val metals = 11
    val buff = 20

    val percent = 100
    val bonus = (crystals * buff) / percent
    val bonus1 = (metals * buff) / percent

    println("Кристаллическая руда = $bonus")
    println("Железная руда = $bonus1")

}