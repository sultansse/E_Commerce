package com.example.myapplication

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ActivityMainBinding

class FavItemsAdapter : RecyclerView.Adapter<FavItemsAdapter.ItemsViewHolder>{
    class ItemsViewHolder(
        val binding: ActivityMainBinding
    ) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ItemsViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}