package com.example.clothesproject.Fragments

import android.net.DnsResolver
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.clothesproject.Apis.User
//import com.example.clothesproject.Apis.service
import com.example.clothesproject.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignupFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_signup, container, false)

        val btn_signup = view.findViewById<Button>(R.id.btn_signUp)


        btn_signup.setOnClickListener{
            findNavController().navigate(R.id.action_signupFragment_to_collectionFragment)

            //signup()
        }
        return view
    }

   /* private fun signup(){

        //view?.findViewById<EditText>(R.id.et_firstName)

        val fName : String = view?.findViewById<EditText>(R.id.et_firstName)?.text.toString()
        //var lName = view?.findViewById<EditText>(R.id.et_firstName)
        val email :String = view?.findViewById<EditText>(R.id.et_email)?.text.toString()
        val password :String= view?.findViewById<TextView>(R.id.et_password)?.text.toString()


        if (fName.isNullOrEmpty() || email.isNullOrEmpty() || password.isNullOrEmpty() )
        {
            error("Please enter mandatory fields")
        }
        else{
            val user = User(
                 fName,
                " "
                   ,email
                    ,password)


            service.signUp(user).enqueue(object : Callback<User>{
                override fun onResponse(call: Call<User>, response: Response<User>) {
                    findNavController().navigate(R.id.action_signupFragment_to_collectionFragment)
                }
                override fun onFailure(call: Call<User>, t: Throwable) {
                    error("Please check your data")
                }
            })
        }

    }*/
}