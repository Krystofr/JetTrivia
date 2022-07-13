package app.christopher.jettrivia.model

data class QuestionItem(
    val answer: String = "",
    val category: String = "",
    val choices: List<String> = listOf(),
    val question: String = ""
)