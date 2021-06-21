package com.compscieddy.gridviewexample

import androidx.recyclerview.widget.RecyclerView
import com.compscieddy.gridviewexample.databinding.GridItemBinding

class GridViewHolder(private val b: GridItemBinding): RecyclerView.ViewHolder(b.root) {
    
    fun bind(number: Int) {
        b.numberView.text = number.toString()
    }
    
}
