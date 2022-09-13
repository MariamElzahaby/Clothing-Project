package com.example.clothesproject.CollectionRecycleView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.viewmodel.viewModelFactory
import androidx.recyclerview.widget.RecyclerView
import com.example.clothesproject.DummyData.Data
import com.example.clothesproject.R


class CollectionAdapter (
    private val dataList: List<Data>,
): RecyclerView.Adapter<CollectionAdapter.Holder>() {


    inner class Holder(view: View): RecyclerView.ViewHolder(view){
        var tv_pName: TextView
        var tv_price: TextView
        lateinit var data: Data

        init {
            tv_pName = view.findViewById(R.id.tv_productName)
            tv_price = view.findViewById(R.id.tv_productPrice)
        }

        fun bind(data: Data) {
            this.data = data
            tv_pName.text = data.name
            tv_price.text = data.price

            itemView.setOnClickListener {
                onItemClickListener?.also {
                    it(data)
                }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollectionAdapter.Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: CollectionAdapter.Holder, position: Int) {
        holder.bind(dataList[position])
    }

    override fun getItemCount(): Int {
        return dataList.size
    }



    private var onItemClickListener: ((Data) -> Unit)? = null

    fun setOnItemClickListener(listener: (Data) -> Unit) {
        onItemClickListener = listener
    }

}