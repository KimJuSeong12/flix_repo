package com.example.flix

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class MobileDataFragment : Fragment() {
    lateinit var mainActivity: MainActivity
    lateinit var mobileDataFragment: MobileDataFragment

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mobile_data, container, false)
    }

}