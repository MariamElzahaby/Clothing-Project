package com.example.clothesproject.collectionRecycleView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.clothesproject.productApis.AllProductResponse
import com.example.clothesproject.R


class CollectionAdapter (
    private val dataList: List<AllProductResponse>
): RecyclerView.Adapter<CollectionAdapter.Holder>() {


    inner class Holder(view: View): RecyclerView.ViewHolder(view){
        var tv_pName: TextView
        var tv_price: TextView
        lateinit var allProductResponse: AllProductResponse

        init {
            tv_pName = view.findViewById(R.id.tv_productName)
            tv_price = view.findViewById(R.id.tv_productPrice)
        }

        fun bind(allProductResponse: AllProductResponse) {
            this.allProductResponse = allProductResponse
            tv_pName.text = allProductResponse.name.toString()
            tv_price.text = allProductResponse.price.toString()

            itemView.setOnClickListener {
                onItemClickListener?.also {
                    it(allProductResponse)
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

    private var onItemClickListener: ((AllProductResponse) -> Unit)? = null

    fun setOnItemClickListener(listener: (AllProductResponse) -> Unit) {
        onItemClickListener = listener
    }

}