
fun main() {
    println("Zad 1")
    val country = Country("Россия", 123.12)
    println(country.getArea())
    println()
    println("Zad 2")
    val cars = arrayOf(Car("Lada", "Granta", 2018), Car("Lada", "KAlina", 2012), Car("Lada", "Iskra", 2025))
    for (i in cars)
    {
        println(i.getModel())
    }
    println()
    println("Zad 3")
    val book = Book("Робинзон Крузо", "Даниэль Дефо", 500)
    println(book.getBookInfo())
    println()
    println("Zad 4")
    val teacher = Teacher("Ирина", "Карпушева", 20)
    println(teacher.getFullName())
    teacher.getQualification()
}