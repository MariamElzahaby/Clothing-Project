package com.example.clothesproject.fragments

import android.content.Context.MODE_PRIVATE
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.clothesproject.R
import com.example.clothesproject.userApis.UserLoginRequest
import com.example.clothesproject.userApis.UserLoginResponse
import com.example.clothesproject.userApis.service
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_login, container, false)
        val btn_login = view.findViewById<Button>(R.id.btn_login)

        btn_login.setOnClickListener{
            login()
        }
        return view
    }

    private fun login(){
        val eMail :String = view?.findViewById<EditText>(R.id.et_signupEmail)?.text.toString()
        val password :String= view?.findViewById<TextView>(R.id.et_password)?.text.toString()

        if (eMail.isNullOrEmpty() || password.isNullOrEmpty() )
        {
            error("Please enter mandatory fields")
        }
        else{
            val userRequest = UserLoginRequest(eMail,password)
            service.login(userRequest).enqueue(object : Callback<UserLoginResponse> {
                override fun onResponse(
                    call: Call<UserLoginResponse>,
                    response: Response<UserLoginResponse>
                ) {
                    requireActivity().getSharedPreferences("profile",MODE_PRIVATE).edit().putString("name", response.body()?.name).apply()
                    requireActivity().getSharedPreferences("profile",MODE_PRIVATE).edit().putString("email", response.body()?.eMail).apply()
                    requireActivity().getSharedPreferences("profile",MODE_PRIVATE).edit().putInt("userId", response.body()?.userId?: 0).apply()
                    findNavController().navigate(R.id.action_loginFragment2_to_homeActivity)
                    requireActivity().finish()
                }
                override fun onFailure(call: Call<UserLoginResponse>, t: Throwable) {
                    Toast.makeText(context,"error", Toast.LENGTH_LONG).show()
                }
            })
        }

    }

}