package app.christopher.jettrivia.repository

import app.christopher.jettrivia.room.QuestionDao
import app.christopher.jettrivia.util.QuestionSeeder
import javax.inject.Inject

class TriviaRepositoryImpl @Inject constructor(private val questionDao: QuestionDao) : TriviaRepository {

    override fun getQuestions(category: String) = questionDao.getQuestionsByCategory(category)

    override suspend fun seedDatabaseIfEmpty() {
        if (questionDao.getCount() == 0) questionDao.insertAll(QuestionSeeder.getSeedQuestions())
    }
}