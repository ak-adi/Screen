package com.example.screen.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.screen.databinding.FragmentMarketBinding
import com.example.screen.databinding.MarketMoversItemlistBinding

class MarketMoverAdapter : RecyclerView.Adapter<MarketMoverAdapter.ViewHolderMarket>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderMarket {
        val binding = MarketMoversItemlistBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolderMarket(binding)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolderMarket, position: Int) {
        TODO("Not yet implemented")
    }

    class ViewHolderMarket(binding : MarketMoversItemlistBinding) : RecyclerView.ViewHolder(binding.root){

    }
}