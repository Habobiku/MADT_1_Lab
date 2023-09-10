package com.example.madt_1_lab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
        binding.changeText.setOnClickListener {
            binding.textView.text = "rnd"
        }
    }
}