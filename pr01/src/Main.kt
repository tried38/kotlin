//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    fun division (x: Int, y: Int): Int {
        return x/y
    }

    fun Salary_bonus(sal: Double) : Double
    {
        val bon = sal*0.15
        val total = sal+bon
        return total
    }

    fun age_7ya(year: Int): Int
    {
        val seven_ya = 2026-year
        return seven_ya
    }
    println("Задание 1 Даны два числа. Вывести результат деления этих чисел.")
    try {
        println("Введите первое число")
        val num1 = readln().toInt()
        println("Введите второе число")
        val num2 = readln().toInt()
        if (num2==0)
        { println("число отрицательное") }
        else
        {val result = division(num1, num2)
            println("Результат: $result") }

    }
    catch (e: Exception) { println(e)}
    println("Задание 2 Дана сумма зарплаты. Вывести сумму зарплаты с 15% премией")
    try {
        println("Введите сумму зарплаты")
        val salary = readln().toDouble()
        if (salary<0)
        {println("Некорректный ввод данных")}
        else {        val res = Salary_bonus(salary)
            println("Результат: $res")}
    }
    catch (e: Exception) { println(e)}
    println("Задание 3 Дан год рождения. Вывести возраст 7 лет назад")
    try {
        println("Введите год рождения")
        val your_yaer = readln().toInt()
        if (your_yaer<1920 || your_yaer>2026)
        {println("Некорректный ввод данных")}
        else{   val resul = age_7ya(your_yaer)
            println("Результат: $resul")}
    }
    catch (e: Exception) { println(e)}

}