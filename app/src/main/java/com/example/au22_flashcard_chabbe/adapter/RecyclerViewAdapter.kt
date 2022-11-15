package com.example.au22_flashcard_chabbe.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.au22_flashcard_chabbe.R
import com.example.au22_flashcard_chabbe.data.Word
import kotlinx.android.synthetic.main.word_item.view.*

abstract class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {
    private var wordList = emptyList<Word>()

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private var wordList = emptyList<Word>()
        val swedishWord = view.findViewById<TextView>(R.id.swedish)
        val englishWord = view.findViewById<TextView>(R.id.english)
        fun bind(word: Word) {
            swedishWord.setText(word.swedish)

            englishWord.setText(word.english)
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerViewAdapter.MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.word_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewAdapter.MyViewHolder, position: Int) {
        val currentWord = wordList.get(position)
        holder.bind(currentWord)
        holder.itemView.setOnClickListener {
            //val action = ListFragmentDirections.actionListFragmentToUpdateFragment(currentWord)
            //holder.itemView.findNavController().navigate(action)

            holder.itemView.swedish.text=currentWord.swedish
            holder.itemView.english.text=currentWord.english
        }
    }

    override fun getItemCount(): Int {
        return wordList.size
    }

    fun setData(wordList: List<Word>) {
        this.wordList = wordList
        notifyDataSetChanged()
    }





}