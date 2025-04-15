package app.christopher.jettrivia.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import app.christopher.jettrivia.domain.Question
import app.christopher.jettrivia.usecase.GetQuestionsByCategoryUseCase
import app.christopher.jettrivia.usecase.SeedQuestionsUseCase
import app.christopher.jettrivia.util.QuestionSeeder
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TriviaViewModel @Inject constructor(
    private val seedQuestionsUseCase: SeedQuestionsUseCase,
    private val getQuestionsByCategoryUseCase: GetQuestionsByCategoryUseCase
) : ViewModel() {

    private val _questions = MutableStateFlow<List<Question>>(emptyList())
    val questions = _questions.asStateFlow()

    private val _isLoading = MutableStateFlow(false)
    val isLoading = _isLoading.asStateFlow()

    fun seedDatabaseIfNeeded() {
        viewModelScope.launch {
            _isLoading.value = true
            seedQuestionsUseCase(QuestionSeeder.getSeedQuestions())
            _isLoading.value = false
        }
    }

    fun loadQuestionsByCategory(category: String) {
        viewModelScope.launch {
            getQuestionsByCategoryUseCase(category)
                .onEach { list ->
                    _questions.value = list
                }
                .launchIn(this)
        }
    }

    fun clearQuestions() {
        _questions.value = emptyList()
    }

}