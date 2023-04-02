package com.example.flix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.flix.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {
    val binding: ActivityMain4Binding by lazy { ActivityMain4Binding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}