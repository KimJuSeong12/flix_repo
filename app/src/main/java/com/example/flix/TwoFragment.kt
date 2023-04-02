package com.example.flix

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.flix.databinding.FragmentTwoBinding

class TwoFragment : Fragment() {
    lateinit var mainActivity:MainActivity
    lateinit var binding: FragmentTwoBinding
    lateinit var dataList2: MutableList<DataList2>
    override fun onAttach(context: Context) {
        super.onAttach(context)
        mainActivity = context as MainActivity
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentTwoBinding.inflate(inflater)
        dataList2 = mutableListOf<DataList2>()

        dataList2.add(DataList2("오징어게임", resources.getString(R.string.squid_game),R.drawable.squid))
        dataList2.add(DataList2("기묘한 이야기 4", resources.getString(R.string.stranger_things_season4),R.drawable.stranger_things_seaons4))
        dataList2.add(DataList2("웬즈데이", resources.getString(R.string.wednesday),R.drawable.wednesday))
        dataList2.add(DataList2("다머", resources.getString(R.string.wednesday),R.drawable.dahmer))
        dataList2.add(DataList2("종이의 집 5", resources.getString(R.string.paper_house),R.drawable.paper_house))
        dataList2.add(DataList2("브리저튼 2", resources.getString(R.string.bridgerton2),R.drawable.bridgerton2))
        dataList2.add(DataList2("브리저튼", resources.getString(R.string.bridgerton2),R.drawable.bridgerton))
        dataList2.add(DataList2("종이의 집 4", resources.getString(R.string.paper_house4),R.drawable.paper_house4))
        dataList2.add(DataList2("기묘한 이야기 3", resources.getString(R.string.stranger_things_season3),R.drawable.stranger_things_seaons3))
        dataList2.add(DataList2("루시퍼 5", resources.getString(R.string.lucifer),R.drawable.lucifer))
        dataList2.add(DataList2("지금 우리 학교는", resources.getString(R.string.school),R.drawable.school))
        dataList2.add(DataList2("위쳐", resources.getString(R.string.witcher),R.drawable.witcher1))
        dataList2.add(DataList2("애나 만들기", resources.getString(R.string.anna),R.drawable.anna))
        dataList2.add(DataList2("지니 & 조지아", resources.getString(R.string.ginny_georgia),R.drawable.ginny_georgia))
        dataList2.add(DataList2("루머의 루머의 루머 2", resources.getString(R.string.reason_why),R.drawable.reasons_why))
        dataList2.add(DataList2("오자크", resources.getString(R.string.ozark),R.drawable.ozark))
        dataList2.add(DataList2("위쳐 2", resources.getString(R.string.witcher),R.drawable.witcher))
        dataList2.add(DataList2("루머의 루머의 루머 1", resources.getString(R.string.reason_why),R.drawable.reason_why1))
        dataList2.add(DataList2("조용한 희망", resources.getString(R.string.maid),R.drawable.maid))
        dataList2.add(DataList2("너의 모든 것 3", resources.getString(R.string.maid),R.drawable.you))

        val customRecycleAdapter = CustomRecycleAdapter2(dataList2)
        binding.recyclerView2.adapter = customRecycleAdapter
        binding.recyclerView2.layoutManager = LinearLayoutManager(mainActivity)
        return binding.root
    }

}