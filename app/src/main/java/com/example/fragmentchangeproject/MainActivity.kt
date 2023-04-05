package com.example.fragmentchangeproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentchangeproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val fragmentManager = supportFragmentManager
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonFirstFragment.setOnClickListener {
           val fragmentTransaction = fragmentManager.beginTransaction()
           fragmentTransaction.add(R.id.frameLayout, FirstFragment())
            fragmentTransaction.addToBackStack(null)
           fragmentTransaction.commit()
        }

        binding.buttonSecondFragment.setOnClickListener {
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.add(R.id.frameLayout, SecondFragment())
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

    }
}