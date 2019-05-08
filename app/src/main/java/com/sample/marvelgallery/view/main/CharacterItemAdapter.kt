package com.sample.marvelgallery.view.main

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sample.marvelgallery.R
import com.sample.marvelgallery.model.MarvelCharacter
import com.sample.marvelgallery.view.common.ItemAdapter
import com.sample.marvelgallery.view.common.bindView
import com.sample.marvelgallery.view.common.loadImage

class CharacterItemAdapter(val character: MarvelCharacter) :
    ItemAdapter<CharacterItemAdapter.ViewHolder>(R.layout.item_character) {

    override fun onCreateViewHolder(itemView: View): ViewHolder = ViewHolder(itemView)

    override fun ViewHolder.onBindViewHoder() {
        textView.text = character.name
        imageView.loadImage(character.imageUrl)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView by bindView<TextView>(R.id.textView)
        val imageView by bindView<ImageView>(R.id.imageView)
    }
}