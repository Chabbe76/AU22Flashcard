package com.example.au22_flashcard_chabbe.data

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface WordDao {
    annotation class Dao

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(word: Word)

    @Delete
    fun delete(word: Word)

    @Query("SELECT * FROM word_table")
    fun readAllData() : LiveData<List<Word>>
    @Update

    fun update(word: Word)

    // delete

    // getAllwords

}