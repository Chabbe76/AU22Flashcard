package com.example.au22_flashcard_chabbe.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope


class WordViewModel (application: Application) : AndroidViewModel(application) {

    val readAllData: LiveData<List<Word>>
    private val repository: WordRepository

    init {
        val wordDao = AppDatabase.getInstance(application).wordDao()
        repository = WordRepository(wordDao)
        readAllData = wordDao.readAllData()
    }

    fun addWord(word: Word) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.addword(word)
        }
    }

    fun updateUser(word: Word) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.updateWord(word)
        }
    }

    fun deleteUser(word: Word) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteWord(word)
        }
    }
}