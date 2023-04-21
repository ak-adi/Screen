package com.example.screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import androidx.fragment.app.replace
import com.example.screen.databinding.ActivityMainBinding
import com.example.screen.fragments.Account
import com.example.screen.fragments.Dashboard
import com.example.screen.fragments.Market
import com.example.screen.fragments.Stats

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Dashboard())
        binding.bottomNavigation.setOnItemSelectedListener {
            when(it.itemId)
            {
                R.id.dashboard -> replaceFragment(Dashboard())
                R.id.chart -> replaceFragment(Stats())
                R.id.user -> replaceFragment(Account())
                R.id.equalizer -> replaceFragment(Market())
                else -> {}

            }
            true
        }
    }

    private fun replaceFragment(fragment : Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
    }
}