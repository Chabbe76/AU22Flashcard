package com.example.au22_flashcard_chabbe.data

import androidx.lifecycle.LiveData

class WordRepository (private val wordDao: WordDao){

    val readAllData: LiveData<List<Word>> = wordDao.readAllData()



    suspend fun addword(word: Word) {
        wordDao.insert(word)
    }

    suspend fun updateWord(word: Word) {
        wordDao.update(word)
    }

    suspend fun deleteWord(word: Word) {
        wordDao.delete(word)
    }
}