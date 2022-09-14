package com.example.clothesproject.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.clothesproject.R


class WelcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_welcome, container, false)

        val login = view.findViewById<Button>(R.id.btn_welcomeLogin)
        login.setOnClickListener{
            findNavController().navigate(R.id.action_welcomeFragment2_to_loginFragment2)
        }

        val signUpHere = view.findViewById<TextView>(R.id.tv_signUpHere)
        signUpHere.setOnClickListener{
            findNavController().navigate(R.id.action_welcomeFragment2_to_signupFragment2)
        }
        return view
    }


}