package app.christopher.jettrivia.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import app.christopher.jettrivia.domain.Question

@Entity(tableName = "questions")
data class QuestionEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val category: String,
    val questionText: String,
    val optionA: String,
    val optionB: String,
    val optionC: String,
    val optionD: String,
    val correctAnswer: String
) {
    fun toDomain() = Question(
        id, category, questionText, optionA, optionB, optionC, optionD, correctAnswer
    )

    companion object {
        fun fromDomain(question: Question) = QuestionEntity(
            id = question.id,
            category = question.category,
            questionText = question.questionText,
            optionA = question.optionA,
            optionB = question.optionB,
            optionC = question.optionC,
            optionD = question.optionD,
            correctAnswer = question.correctAnswer
        )
    }
}