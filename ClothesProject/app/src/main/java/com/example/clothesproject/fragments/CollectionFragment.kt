package com.example.clothesproject.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.clothesproject.productApis.service2
import com.example.clothesproject.R
import com.example.clothesproject.collectionRecycleView.CollectionAdapter
import com.example.clothesproject.productApis.AllProductResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CollectionFragment() : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: CollectionAdapter
    lateinit var list : List<AllProductResponse>

    /*val list = listOf<Data>
    (
        Data("T-shirt1", "251$"),
        Data("T-shirt2", "252$"),
        Data("T-shirt3", "253$"),
        Data("T-shirt4", "254$"),
        Data("T-shirt5", "255$"),
        Data("T-shirt6", "256$"),
        Data("T-shirt7", "257$"),
        Data("T-shirt8", "258$"),
        Data("T-shirt9", "259$")

    )
*/
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_collection, container, false)
        recyclerView = view.findViewById(R.id.rv_collection)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setCollection()
    }

    private fun setCollection(){

        service2.getAllProducts().enqueue(object : Callback<List<AllProductResponse>>
        {
            override fun onResponse(
                call: Call<List<AllProductResponse>>,
                response: Response<List<AllProductResponse>>
            ) {
                setupRecyclerView(response.body())
            }

            override fun onFailure(call: Call<List<AllProductResponse>>, t: Throwable) {
                TODO("Not yet implemented")
            }


        })

    }

    private fun setupRecyclerView(list: List<AllProductResponse>?) {
        list?.let {
            adapter = CollectionAdapter(list)
            recyclerView.apply {
                layoutManager = GridLayoutManager(requireContext(), 2)
            }
            recyclerView.adapter = adapter
            adapter.setOnItemClickListener {
                val bundle = Bundle()
                bundle.putSerializable("data", it)
                findNavController().navigate(
                    R.id.action_collectionFragment2_to_detailsFragment2,
                    bundle
                )

            }
        }

    }
}