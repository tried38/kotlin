open class User(private val name: String, private val surname: String) {
    fun getFullName(): String {return "$name $surname"}
}