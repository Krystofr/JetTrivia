package app.christopher.jettrivia.repository

import app.christopher.jettrivia.data.DataOrException
import app.christopher.jettrivia.model.QuestionItem
import app.christopher.jettrivia.network.QuestionApi
import javax.inject.Inject

class QuestionRepository @Inject constructor(private val api: QuestionApi) {

    private val listOfQuestions =
        DataOrException<ArrayList<QuestionItem>, Boolean, Exception>()
}
