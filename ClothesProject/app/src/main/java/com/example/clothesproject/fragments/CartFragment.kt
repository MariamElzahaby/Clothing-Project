package com.example.clothesproject.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.clothesproject.R
import com.example.clothesproject.dummyData.Clothes

class CartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cart, container, false)
    }
/*
        private lateinit var newRecyclerView: RecyclerView
        private lateinit var newArrayList: ArrayList<Clothes>
        lateinit var productImage: Array<Int>
        lateinit var name:Array<String>
        lateinit var price:Array<Int>
        lateinit var sumtextview:TextView

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            productImage = arrayOf(
                R.drawable.android,
                R.drawable.pic2
            )
            name = arrayOf(
                "yellow pullover",
                "red pullover",
                "whit hoodie"
            )
            price = arrayOf(
                220,55,88
            )

            newRecyclerView = view.findViewById(R.id.rv)
            newRecyclerView.layoutManager = LinearLayoutManager(context)
            newRecyclerView.setHasFixedSize(true)
            newArrayList = ArrayList<Clothes>()
            getUserdata()
            val sum=getTotalPrice()
            sumtextview=view.findViewById<TextView>(R.id.totalExpense)
            sumtextview.setText("$$sum")

        }
        fun getTotalPrice():Int {
            var sum =0
            for(current in newArrayList) {
                sum=sum+current.price*current.count
            }
            return sum
        }

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_cart, container, false)
        }
        private fun getUserdata() {
            for (i in productImage.indices) {
                val news = Clothes (productImage[i], name[i], price[i])
                newArrayList.add(news)
            }
            newRecyclerView.adapter=ItemsAdapter(newArrayList){postion,newcount->
                newArrayList[postion].count=newcount
                val sum=getTotalPrice()

                sumtextview.setText("$$sum")
            }
        }

        /*companion object {
            /**
             * Use this factory method to create a new instance of
             * this fragment using the provided parameters.
             *
             * @param param1 Parameter 1.
             * @param param2 Parameter 2.
             * @return A new instance of fragment HomeFragment.
             */
            // TODO: Rename and change types and number of parameters
            @JvmStatic
            fun newInstance(param1: String, param2: String) =
                HomeFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
        }
    */
    /*override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cart, container, false)
    }*/
*/
}