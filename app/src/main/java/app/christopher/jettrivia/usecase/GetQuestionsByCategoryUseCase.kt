package app.christopher.jettrivia.usecase

import app.christopher.jettrivia.domain.Question
import app.christopher.jettrivia.repository.TriviaRepository
import kotlinx.coroutines.flow.Flow

class GetQuestionsByCategoryUseCase(
    private val repository: TriviaRepository
) {
    operator fun invoke(category: String): Flow<List<Question>> {
        return repository.getQuestionsByCategory(category)
    }
}