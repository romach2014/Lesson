package Lesson_3

fun main(){

    val digitUsed = 6

    val numbers = """
        | $digitUsed x 1 = ${digitUsed*1}
        | $digitUsed x 2 = ${digitUsed*2} 
        | $digitUsed x 3 = ${digitUsed*3}
        | $digitUsed x 4 = ${digitUsed*4}
        | $digitUsed x 5 = ${digitUsed*5}
        | $digitUsed x 6 = ${digitUsed*6}
        | $digitUsed x 7 = ${digitUsed*7}
        | $digitUsed x 8 = ${digitUsed*8}
        | $digitUsed x 9 = ${digitUsed*9} """.trimMargin()

    println(numbers)

}