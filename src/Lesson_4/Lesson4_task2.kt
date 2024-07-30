package Lesson_4

fun main() {

    val minKg = 35
    val maxKg = 100
    val maxVolume = 100


    val cargoKg = 20
    val cargoVolume = 80

    val cargoKg1 = 50
    val cargoVolume1 = 100


    println("Груз с весом $cargoKg кг и объемом $cargoVolume л соответствует категории 'Average': " +
            (cargoKg > minKg && cargoKg <= maxKg && cargoVolume < maxVolume))


    println("Груз с весом $cargoKg1 кг и объемом $cargoVolume1 л соответствует категории 'Average': " +
            (cargoKg1 > minKg && cargoKg1 <= maxKg && cargoVolume1 < maxVolume))

}
