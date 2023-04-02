package com.example.flix

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.flix.databinding.FragmentOneBinding


class OneFragment : Fragment() {

    lateinit var mainActivity: MainActivity
    lateinit var binding: FragmentOneBinding
    lateinit var dataList: MutableList<DataList>
    override fun onAttach(context: Context) {
        super.onAttach(context)
        mainActivity = context as MainActivity
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOneBinding.inflate(inflater)
        dataList = mutableListOf<DataList>()

            dataList.add(DataList(R.drawable.the_glory))
            dataList.add(DataList(R.drawable.walking_dead))
            dataList.add(DataList(R.drawable.wednesday))
            dataList.add(DataList(R.drawable.cyberpunk))
            dataList.add(DataList(R.drawable.suriname))
            dataList.add(DataList(R.drawable.bbu))
            dataList.add(DataList(R.drawable.squid))
            dataList.add(DataList(R.drawable.hathaway))
            dataList.add(DataList(R.drawable.school))
            dataList.add(DataList(R.drawable.nanno))

        val customRecycleAdapter = CustomRecycleAdapter(dataList)
        binding.recyclerView.adapter = customRecycleAdapter
        binding.recyclerView.layoutManager = LinearLayoutManager(mainActivity)
        return binding.root
    }

}