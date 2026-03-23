class Book(private val title: String, private val author: String, private val pages: Int) {
    fun getBookInfo() : String{ return  "Название: $title Автор: $author Количество страниц: $pages"}
}