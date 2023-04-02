package com.example.flix

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.flix.databinding.ItemViewBinding

class CustomRecycleAdapter(val dataList: MutableList<DataList>) :
    RecyclerView.Adapter<CustomRecycleAdapter.CustomViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val itemViewBinding: ItemViewBinding =
            ItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CustomViewHolder(itemViewBinding)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val itemViewBinding = holder.itemViewBinding
        itemViewBinding.ivPicture.setImageResource(dataList.get(position).ivpicture)
        itemViewBinding.ivPicture.setOnClickListener {
            Toast.makeText(
                itemViewBinding.root.context,
                "준비 중",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    class CustomViewHolder(val itemViewBinding: ItemViewBinding) :
        RecyclerView.ViewHolder(itemViewBinding.root)
}