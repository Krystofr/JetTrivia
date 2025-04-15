package app.christopher.jettrivia.di

import android.content.Context
import androidx.room.Room
import app.christopher.jettrivia.data.TriviaDao
import app.christopher.jettrivia.data.TriviaDatabase
import app.christopher.jettrivia.repository.TriviaRepository
import app.christopher.jettrivia.repository.TriviaRepositoryImpl
import app.christopher.jettrivia.usecase.GetQuestionsByCategoryUseCase
import app.christopher.jettrivia.usecase.SeedQuestionsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): TriviaDatabase {
        return Room.databaseBuilder(
            context,
            TriviaDatabase::class.java,
            "trivia_db"
        ).fallbackToDestructiveMigration(false).build()
    }

    @Provides
    fun provideDao(db: TriviaDatabase) = db.triviaDao()

    @Provides
    @Singleton
    fun provideRepository(dao: TriviaDao): TriviaRepository {
        return TriviaRepositoryImpl(dao)
    }

    @Provides
    fun provideSeedQuestionsUseCase(repository: TriviaRepository) =
        SeedQuestionsUseCase(repository)

    @Provides
    fun provideGetQuestionsUseCase(repository: TriviaRepository) =
        GetQuestionsByCategoryUseCase(repository)
}