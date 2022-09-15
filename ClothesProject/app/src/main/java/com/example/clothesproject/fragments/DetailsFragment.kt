package com.example.clothesproject.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.clothesproject.R
import com.example.clothesproject.databinding.FragmentDetailsBinding


class DetailsFragment (): Fragment() {

    val args : DetailsFragmentArgs by navArgs()
    lateinit var binding: FragmentDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailsBinding.inflate(inflater,container,false)
        val backtoCollection = binding.ivBack

        backtoCollection.setOnClickListener{
            findNavController().navigate(R.id.action_detailsFragment2_to_collectionFragment2)
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data = args.data

        binding.apply {
            Glide.with(this@DetailsFragment).load(data.image).into(ivImage)
            tvTitleTxt.text = data.name
            tvPrice.text = data.price.toString()
        }

    }

}