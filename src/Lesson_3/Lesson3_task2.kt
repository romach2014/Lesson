package Lesson_3
fun main() {


    val firstName = "Татьяна"
    val lastName = "Сергеевна"
    val middleName = "Андреевна"
    val age = "20"


    val firstName1 = "Татьяна"
    val lastName1 = "Сидорова"
    val meddleName1 = "Андреевна"
    val age1 = "22"
    val dataUser = """
    |$lastName $firstName  $middleName, $age  
            |$lastName1 $firstName1  $meddleName1, $age1
            |""".trimMargin()

    println("$dataUser")


}