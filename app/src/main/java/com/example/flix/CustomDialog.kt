package com.example.flix

import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.view.WindowManager
import com.example.flix.databinding.ActivityMain3Binding
import com.example.flix.databinding.DataBinding

class CustomDialog(val context: Context,val mainBinding: ActivityMain3Binding) {
    val dialog = Dialog(context)

    fun showDialog(){
        val binding = DataBinding.inflate(LayoutInflater.from(context))
        dialog.setContentView(binding.root)
        dialog.window?.setLayout(WindowManager.LayoutParams.WRAP_CONTENT,WindowManager.LayoutParams.WRAP_CONTENT)
        dialog.setCanceledOnTouchOutside(true)
        dialog.setCancelable(true)
        dialog.show()

    }
}