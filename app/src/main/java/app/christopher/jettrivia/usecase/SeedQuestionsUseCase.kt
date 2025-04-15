package app.christopher.jettrivia.usecase

import app.christopher.jettrivia.domain.Question
import app.christopher.jettrivia.repository.TriviaRepository

class SeedQuestionsUseCase(
    private val repository: TriviaRepository
) {
    suspend operator fun invoke(questions: List<Question>) {
        repository.seedQuestions(questions)
    }
}