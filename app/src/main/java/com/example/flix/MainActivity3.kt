package com.example.flix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import android.widget.Toast
import com.example.flix.databinding.ActivityMain3Binding
import com.example.flix.databinding.DataBinding

class MainActivity3 : AppCompatActivity() {
    val binding: ActivityMain3Binding by lazy { ActivityMain3Binding.inflate(layoutInflater) }
    lateinit var data: DataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        data = DataBinding.inflate(layoutInflater)

        binding.linearLayout2.setOnClickListener {
            val customDialog = CustomDialog(this,binding)
            customDialog.showDialog()
        }
        binding.linearLayout3.setOnClickListener {
            Toast.makeText(applicationContext,"준비중", Toast.LENGTH_SHORT).show()
        }
        binding.linearLayout4.setOnClickListener {
            Toast.makeText(applicationContext,"준비중", Toast.LENGTH_SHORT).show()
        }
    }
}