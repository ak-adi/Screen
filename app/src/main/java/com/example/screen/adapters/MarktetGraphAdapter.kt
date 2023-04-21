package com.example.screen.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.screen.databinding.MarktetItemlistBinding


class MarktetGraphAdapter : RecyclerView.Adapter<MarktetGraphAdapter.ViewHolderMarketGraph>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderMarketGraph {
       val binding = MarktetItemlistBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolderMarketGraph(binding)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolderMarketGraph, position: Int) {
        TODO("Not yet implemented")
    }

    class ViewHolderMarketGraph(binding : MarktetItemlistBinding) :RecyclerView.ViewHolder(binding.root){

    }
}