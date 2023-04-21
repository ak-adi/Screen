package com.example.screen.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.screen.databinding.FragmentDashboardBinding
import com.github.mikephil.charting.charts.LineChart


class Dashboard : Fragment() {

    private lateinit var binding : FragmentDashboardBinding
    private lateinit var chart : LineChart

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding = FragmentDashboardBinding.inflate(inflater,container,false)
//        chart = LineChart(requireContext())
//        val adapter: DashboardAdapter = DashboardAdapter()
//        binding.recyclerView.adapter = adapter
        return binding.root

    }

}