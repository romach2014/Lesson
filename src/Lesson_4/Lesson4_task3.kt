package Lesson_4

fun main() {

    val sunnyWeather: Boolean = true
    val tentOpen: Boolean = true
    val airHumidity: Int = 20
    val currentSeason: String = "зима"


    val analysis = sunnyWeather && tentOpen && airHumidity == 20 && currentSeason != "зима"

    // Вывод результата
    println("Благоприятные ли условия сейчас для роста бобовых? $analysis")

}

