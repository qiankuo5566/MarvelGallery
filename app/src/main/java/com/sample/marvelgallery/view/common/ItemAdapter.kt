package com.sample.marvelgallery.view.common

import android.support.annotation.LayoutRes
import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class ItemAdapter<T : RecyclerView.ViewHolder>(@LayoutRes open val layoutId: Int) {

    abstract fun onCreateViewHolder(itemView: View): T

    @Suppress("UNCHECKED_CAST")
    fun bindViewHolder(holder: RecyclerView.ViewHolder) {
        (holder as T).onBindViewHoder()
    }

    abstract fun T.onBindViewHoder()
}