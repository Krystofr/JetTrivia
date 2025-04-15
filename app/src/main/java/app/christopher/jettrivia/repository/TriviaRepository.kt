package app.christopher.jettrivia.repository

import app.christopher.jettrivia.domain.Question
import kotlinx.coroutines.flow.Flow

interface TriviaRepository {
    suspend fun seedQuestions(questions: List<Question>)
    fun getQuestionsByCategory(category: String): Flow<List<Question>>
}