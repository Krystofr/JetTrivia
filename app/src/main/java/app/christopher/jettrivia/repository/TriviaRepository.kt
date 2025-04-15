package app.christopher.jettrivia.repository

import app.christopher.jettrivia.room.Question
import kotlinx.coroutines.flow.Flow

interface TriviaRepository {

    fun getQuestions(category: String) : Flow<List<Question>>

    suspend fun seedDatabaseIfEmpty()

}