package Lesson_2

fun main() {

    val fifteenWorker = 50
    val thirtyWorker = 30
    val worker = (fifteenWorker + thirtyWorker)

    val cash = 30000
    val cash1 = 20000

    val paycheck = (fifteenWorker * cash)
    val paycheck1 = (thirtyWorker * cash1 + paycheck)
    val middleCash = (paycheck1 / worker)

    println("Расходы на выплату постоянным сотрудникам: $paycheck")
    println("Общие расходы по ЗП после прихода стажеров: $paycheck1")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $middleCash")

}