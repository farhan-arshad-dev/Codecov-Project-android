package com.project.codecov

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.project.codecov.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvValue.text = "The Number 99 is odd: ${Utils.isOddNumber(99)}"
    }
}
