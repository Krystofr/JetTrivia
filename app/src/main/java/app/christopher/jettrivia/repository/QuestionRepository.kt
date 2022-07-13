package app.christopher.jettrivia.repository

import android.util.Log
import app.christopher.jettrivia.data.DataOrException
import app.christopher.jettrivia.model.QuestionItem
import app.christopher.jettrivia.network.QuestionApi
import javax.inject.Inject

class QuestionRepository @Inject constructor(private val api: QuestionApi) {

    private val dataOrException =
        DataOrException<ArrayList<QuestionItem>, Boolean, Exception>()

    suspend fun getAllQuestions() : DataOrException<ArrayList<QuestionItem>, Boolean, Exception>{
        try {
            dataOrException.loading = true
            dataOrException.data = api.getAllQuestions()
            if (dataOrException.data.toString().isNotEmpty()) dataOrException.loading = false

        } catch (ex: Exception) {
            dataOrException.e = ex
            Log.d("Exception", "getAllQuestions(): ${dataOrException.e!!.localizedMessage?.toString()}")
        }
        return dataOrException
    }
}
