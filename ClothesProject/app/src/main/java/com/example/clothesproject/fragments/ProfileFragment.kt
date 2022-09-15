package com.example.clothesproject.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.fragment.findNavController
import com.example.clothesproject.R
import com.example.clothesproject.userApis.UserDataResponse
import com.example.clothesproject.userApis.service
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        profile()

        val btnLogout = view.findViewById<AppCompatButton>(R.id.acb_logout)
        btnLogout.setOnClickListener{
            findNavController().navigate(R.id.action_profileFragment2_to_vareficationActivity)
            requireActivity().finish()
        }
        return view
    }

    private fun profile(){
        val profileName = view?.findViewById<TextView>(R.id.profileName)
        val profileEmail = view?.findViewById<TextView>(R.id.profileEmail)

        val userId = requireActivity().getSharedPreferences("profile", Context.MODE_PRIVATE).getInt("userId", 0 )

        service.getProfile(userId).enqueue(object : Callback<UserDataResponse>{
            override fun onResponse(
                call: Call<UserDataResponse>,
                response: Response<UserDataResponse>
            ) {
                profileName?.text = response.body()?.name
                profileEmail?.text = response.body()?.email
            }
            override fun onFailure(call: Call<UserDataResponse>, t: Throwable) {
                profileName?.text = " "
                profileEmail?.text = " "
            }

        })
    }

}