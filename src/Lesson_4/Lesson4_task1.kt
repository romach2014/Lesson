package Lesson_4

fun main() {
    val allTables = 13
    val closeToday = allTables
    val closeTomorrow = allTables - 4

    val openToday= closeToday < allTables
    val openTomorrow = closeTomorrow < allTables

    println("[Доступность столиков на сегодня: $openToday]")
    println("[Доступность столиков на завтра: $openTomorrow]")

}



