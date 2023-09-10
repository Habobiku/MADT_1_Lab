package com.example.madt_1_lab

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.madt_1_lab.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        buttonClicker()
    }

    private fun buttonClicker() {
        binding.changeText.setOnClickListener {
            binding.textView.text = "rnd"
        }
        binding.changeColor.setOnClickListener {
            binding.textView.setTextColor(Color.RED)
        }
    }
}