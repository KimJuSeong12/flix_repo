package com.example.flix

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.flix.databinding.ItemView2Binding
import com.example.flix.databinding.ItemViewBinding

class CustomRecycleAdapter2(val dataList2: MutableList<DataList2>) :
    RecyclerView.Adapter<CustomRecycleAdapter2.CustomViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val itemView2Binding: ItemView2Binding =
            ItemView2Binding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CustomViewHolder(itemView2Binding)
    }

    override fun getItemCount(): Int = dataList2.size

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val itemView2Binding = holder.itemView2Binding

        itemView2Binding.tvTitle.text = dataList2.get(position).tvTitle
        itemView2Binding.tvDetail.text = dataList2.get(position).tvDetail
        itemView2Binding.ivPicture2.setImageResource(dataList2.get(position).ivPicture2)
        itemView2Binding.root.setOnClickListener {
            Toast.makeText(
                itemView2Binding.root.context,
                "준비 중",
                Toast.LENGTH_SHORT
            ).show()
        }

    }

    class CustomViewHolder(val itemView2Binding: ItemView2Binding) :
        RecyclerView.ViewHolder(itemView2Binding.root)
}