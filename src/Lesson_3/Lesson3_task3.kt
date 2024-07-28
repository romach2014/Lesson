package Lesson_3

fun main(){

    val a = 6

    val b = 1
    val c = 2
    val d = 3
    val e = 4
    val f = 5
    val g = 6
    val o = 7
    val t = 8
    val r = 9

    val number1 = a * 1
    val number2 = a * 2
    val number3 = a * 3
    val number4 = a * 4
    val number5 = a * 5
    val number6 = a * 6
    val number7 = a * 7
    val number8 = a * 8
    val number9 = a * 9

    val numbers = """
        | $a x $b = $number1 
        | $a x $c = $number2 
        | $a x $d = $number3 
        | $a x $e = $number4 
        | $a x $f = $number5 
        | $a x $g = $number6 
        | $a x $o = $number7 
        | $a x $t = $number8 
        | $a x $r = $number9""".trimMargin()


    println(numbers)

}