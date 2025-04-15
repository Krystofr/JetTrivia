package app.christopher.jettrivia.data

import androidx.room.Database
import androidx.room.RoomDatabase
import app.christopher.jettrivia.domain.Question

@Database(entities = [QuestionEntity::class], version = 1)
abstract class TriviaDatabase : RoomDatabase() {
    abstract fun triviaDao(): TriviaDao
}