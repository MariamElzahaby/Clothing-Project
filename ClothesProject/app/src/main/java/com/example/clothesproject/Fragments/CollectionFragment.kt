package com.example.clothesproject.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.clothesproject.CollectionRecycleView.CollectionAdapter
import com.example.clothesproject.CollectionRecycleView.productClickInterface
import com.example.clothesproject.DummyData.Data
import com.example.clothesproject.DummyData.mock
import com.example.clothesproject.R

class CollectionFragment() : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: CollectionAdapter
    val list = listOf<Data>(
        Data("T-shirt", "250$"),
        Data("T-shirt", "250$"),
        Data("T-shirt", "250$"),
        Data("T-shirt", "250$"),
        Data("T-shirt", "250$"),
        Data("T-shirt", "250$"),
        Data("T-shirt", "250$"),
        Data("T-shirt", "250$"),
        Data("T-shirt", "250$")

    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_collection, container, false)
        recyclerView = view.findViewById(R.id.rv_collection)

        /*val productDetails = view.findViewById<ImageView>(R.id.iv_productImage)

        productDetails.setOnClickListener{

        }*/

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //setupRecyclerView()
        adapter = CollectionAdapter(list)
        recyclerView.adapter = adapter
        adapter.setOnItemClickListener {
            val bundle = Bundle().apply {
                putSerializable("data",it)
            }
            findNavController().navigate(R.id.action_collectionFragment_to_detailsFragment, bundle)

        }

    }

    /*private fun setupRecyclerView() {
        recyclerView.apply {
            layoutManager = GridLayoutManager(requireContext(),2)
            adapter = CollectionAdapter(mock.dataList, productClickInterface )
        }

        recyclerView.onItemClickListener

    }*/





}