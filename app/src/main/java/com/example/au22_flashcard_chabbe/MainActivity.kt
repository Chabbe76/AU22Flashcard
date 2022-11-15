package com.example.au22_flashcard_chabbe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupActionBarWithNavController(findNavController(R.id.fragmentContainerView))
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.fragmentContainerView)
        return super.onSupportNavigateUp() || super.onSupportNavigateUp()
    }
}
/*class MainActivity : AppCompatActivity() {
    private lateinit var job : Job
    private lateinit var db : AppDatabase
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + job



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        job = Job()
        //val list = loadAllItems()
        val list = loadByCategory("kyl")
        launch {
            val itemList = list.await()

            //val list = loadAllItems()
            val list = loadByCategory("kyl")

    }}
    fun delete(word : Word) =
        launch(Dispatchers.IO) {
            db.wordDao.delete(word)
        }


    fun loadAllItems() : Deferred<List<Word>> =
        async(Dispatchers.IO) {
            db.wordDao.getAll()
        }

    fun saveItem(word: Word) {
        launch(Dispatchers.IO) {
            db.wordDao.insert(word)

        }
        }
    }*/



