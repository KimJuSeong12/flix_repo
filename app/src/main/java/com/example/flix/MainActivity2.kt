package com.example.flix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.flix.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    val binding: ActivityMain2Binding by lazy { ActivityMain2Binding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.ivWalkingDead.setOnClickListener {
            Toast.makeText(applicationContext,"준비중",Toast.LENGTH_SHORT).show()
        }

        binding.ivWednesday.setOnClickListener {
            Toast.makeText(applicationContext,"준비중",Toast.LENGTH_SHORT).show()
        }

        binding.ivCyberpunk.setOnClickListener {
            Toast.makeText(applicationContext,"준비중",Toast.LENGTH_SHORT).show()
        }

        binding.ivHathaway.setOnClickListener {
            Toast.makeText(applicationContext,"준비중",Toast.LENGTH_SHORT).show()
        }

        binding.ivNanno.setOnClickListener {
            Toast.makeText(applicationContext,"준비중",Toast.LENGTH_SHORT).show()
        }

        binding.ivLucifer.setOnClickListener {
            Toast.makeText(applicationContext,"준비중",Toast.LENGTH_SHORT).show()
        }

    }
}