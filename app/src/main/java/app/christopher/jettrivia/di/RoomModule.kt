package app.christopher.jettrivia.di

import android.content.Context
import androidx.room.Room
import app.christopher.jettrivia.data.TriviaDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    @Provides
    @Singleton
    fun provideQuestionsDatabase(@ApplicationContext context: Context): TriviaDatabase =
        Room.databaseBuilder(context, TriviaDatabase::class.java, "trivia_db")
            .fallbackToDestructiveMigration()
            .build()
}