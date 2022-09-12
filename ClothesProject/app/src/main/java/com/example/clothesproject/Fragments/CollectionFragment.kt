package com.example.clothesproject.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.clothesproject.CollectionRecycleView.CollectionAdapter
import com.example.clothesproject.DummyData.mock
import com.example.clothesproject.R

class CollectionFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_collection, container, false)
        recyclerView = view.findViewById(R.id.rv_collection)

        val productDetails = view.findViewById<ImageView>(R.id.iv_productImage)
        productDetails.setOnClickListener{
            findNavController().navigate(R.id.action_collectionFragment_to_detailsFragment)
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        recyclerView.apply {
            layoutManager = GridLayoutManager(requireContext(),2)
            adapter = CollectionAdapter(mock.dataList)
        }

    }


}