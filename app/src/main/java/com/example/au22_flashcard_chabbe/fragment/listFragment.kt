/*package com.example.au22_flashcard_chabbe.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.au22_flashcard_chabbe.R
import com.example.au22_flashcard_chabbe.adapter.RecyclerViewAdapter
import com.example.au22_flashcard_chabbe.data.WordViewModel
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListFragment : Fragment() {

    private lateinit var recyclerViewAdapter: RecyclerViewAdapter
    private lateinit var wordViewModel: WordViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_list, container, false)

        wordViewModel = ViewModelProvider(this).get(WordViewModel::class.java)

        val fab = view.findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_addFragment)
        }

        //Init RecyclerView
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerViewAdapter = RecyclerViewAdapter()
        recyclerView.adapter = recyclerViewAdapter
        wordViewModel.readAllData.observe(viewLifecycleOwner, Observer { wordList ->
            recyclerViewAdapter.setData(wordList)
            if (wordList.size == 0) {
                Toast.makeText(context, "Tomt ordbok", Toast.LENGTH_SHORT).show()
            }
        })

        return view
    }

}*/