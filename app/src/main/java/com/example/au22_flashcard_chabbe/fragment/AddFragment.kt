package com.example.au22_flashcard_chabbe.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.au22_flashcard_chabbe.R
import com.example.au22_flashcard_chabbe.data.Word
import com.example.au22_flashcard_chabbe.data.WordViewModel
import com.google.android.material.textfield.TextInputEditText

class AddFragment : Fragment() {

    private lateinit var wordViewModel: WordViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_add, container, false)

        wordViewModel = ViewModelProvider(this).get(WordViewModel::class.java)
        val swedish = view.findViewById<TextInputEditText>(R.id.swedishWord)
        val english = view.findViewById<TextInputEditText>(R.id.englishWord)
        val insertButton = view.findViewById<Button>(R.id.insertButton)

        insertButton.setOnClickListener {
            val word = Word(0, swedish.text.toString(), english.text.toString())
            wordViewModel.addWord(word)
            Toast.makeText(requireContext(), "Ord tilllagt", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_addFragment_to_listFragment)
        }

        return view
    }


}