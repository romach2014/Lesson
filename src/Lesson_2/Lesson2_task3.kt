package Lesson_2

fun main() {

    val hour = 9
    val minute = 39
    val minuteWay = 457

    val minutesInHour = 60
    val hoursInDay = 24

    val totalMinutes = minute + minuteWay
    val arrivalHour = (hour + totalMinutes / minutesInHour) % hoursInDay
    val arrivalMinute = totalMinutes % minutesInHour


    println("Время прибытия поезда: $arrivalHour:$arrivalMinute")
}