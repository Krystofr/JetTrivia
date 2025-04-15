package app.christopher.jettrivia.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Question::class], version = 1)
abstract class TriviaDatabase : RoomDatabase() {
    abstract fun questionDao(): QuestionDao
}