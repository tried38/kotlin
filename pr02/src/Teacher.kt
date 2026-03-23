class Teacher(private val name: String, private val surname: String, private val experience_year: Int ) : User(name, surname) {
    fun getQualification()
    {
        if (experience_year<5) {
            println("начинающий преподаватель")}
        else if (experience_year in 5..9){
            println("начинающий преподаватель")}
        else { println("начинающий преподаватель")}
    }
}