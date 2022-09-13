package com.example.clothesproject.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.clothesproject.DummyData.Data
import com.example.clothesproject.DummyData.mock
import com.example.clothesproject.R


class DetailsFragment (): Fragment() {

    val args : DetailsFragmentArgs by navArgs()
    lateinit var tvTitle : TextView
    lateinit var tvPrice : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_details, container, false)

        val backtoCollection = view.findViewById<ImageView>(R.id.iv_back)
         tvTitle = view.findViewById<TextView>(R.id.tv_titleTxt)
         tvPrice = view.findViewById<TextView>(R.id.tv_price)

        backtoCollection.setOnClickListener{
            findNavController().navigate(R.id.action_detailsFragment_to_collectionFragment)
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data = args.data
        tvTitle.text = data.name
        tvPrice.text = data.price

    }

}