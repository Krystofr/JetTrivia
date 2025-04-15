package app.christopher.jettrivia.repository

import app.christopher.jettrivia.data.QuestionEntity
import app.christopher.jettrivia.data.TriviaDao
import app.christopher.jettrivia.domain.Question
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class TriviaRepositoryImpl(
    private val dao: TriviaDao
) : TriviaRepository {
    override suspend fun seedQuestions(questions: List<Question>) {
        val entities = questions.map { QuestionEntity.fromDomain(it) }
        dao.insertAll(entities)
    }

    override fun getQuestionsByCategory(category: String): Flow<List<Question>> {
        return dao.getQuestionsByCategory(category).map { list ->
            list.map { it.toDomain() }
        }
    }
}