package com.sample.marvelgallery.view.main

import com.sample.marvelgallery.view.common.AnyItemAdapter
import com.sample.marvelgallery.view.common.RecyclerListAdapter

class MainListAdapter(items: List<AnyItemAdapter>) : RecyclerListAdapter(items) {

    fun add(itemAdapter: AnyItemAdapter) {
        items += itemAdapter
        val index = items.indexOf(itemAdapter)
        if (index == -1) return
        notifyItemInserted(index)
    }

    fun delete(itemAdapter: AnyItemAdapter) {
        val index = items.indexOf(itemAdapter)
        if (index == -1) return
        items -= itemAdapter
        notifyItemRemoved(index)
    }
}