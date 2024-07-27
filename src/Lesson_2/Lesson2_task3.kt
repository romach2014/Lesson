package Lesson_2

fun main() {

    val hour = 9
    val minute = 39
    val minuteWay = 457


    val totalMinutes = minute + minuteWay
    val arrivalHour = (hour + totalMinutes / 60) % 24
    val arrivalMinute = totalMinutes % 60


    println("Время прибытия поезда: $arrivalHour:$arrivalMinute")
}