package Lesson_2

fun main() {

    val crystals = 7
    val metals = 11
    val buff: Float = 0.2f


    val bonus = (crystals * buff).toInt()
    val bonus1 = (metals * buff).toInt()



    println("Кристаллическая руда = $bonus")
    println("Железная руда = $bonus1")


}