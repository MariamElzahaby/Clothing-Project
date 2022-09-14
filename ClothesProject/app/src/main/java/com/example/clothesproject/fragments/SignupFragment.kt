package com.example.clothesproject.fragments

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
import com.example.clothesproject.userApis.UserSignUp
import com.example.clothesproject.userApis.service
import com.example.clothesproject.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignupFragment : Fragment() {
   /* lateinit var name : EditText
    lateinit var e_Mail : EditText
    lateinit var password : EditText*/

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_signup, container, false)
        /*name =  view.findViewById<EditText>(R.id.et_userName)
        name.error = "It's required"
        e_Mail = view.findViewById<EditText>(R.id.et_signupEmail)
        e_Mail.error = "It's required"
        password = view.findViewById<EditText>(R.id.et_password)
        password.error = "It's required"*/

        val btn_signup = view.findViewById<Button>(R.id.btn_signUp)
        btn_signup.setOnClickListener{

            signup()

        }
        return view
    }

    private fun signup(){

        /*name = view?.findViewById<EditText>(R.id.et_userName)?.text.toString()
        e_Mail = view?.findViewById<EditText>(R.id.et_signupEmail)?.text.toString()
        password = view?.findViewById<TextView>(R.id.et_password)?.text.toString()*/

        val name : String = view?.findViewById<EditText>(R.id.et_userName)?.text.toString()
        val e_Mail : String = view?.findViewById<EditText>(R.id.et_signupEmail)?.text.toString()
        val password : String= view?.findViewById<TextView>(R.id.et_password)?.text.toString()
        val retypePassword : String= view?.findViewById<TextView>(R.id.et_retype_password)?.text.toString()



        if (name.isNullOrEmpty() || e_Mail.isNullOrEmpty() || password.isNullOrEmpty() || retypePassword.isNullOrEmpty() )
        {
            error("Please enter mandatory fields")
        }
        else if (password!=retypePassword){
            error("Please retype the password correctly ")
        }
        else{
            val user = UserSignUp(
                 name
                   ,e_Mail
                    ,password)

            service.signUp(user).enqueue(object : Callback<Unit>{
                override fun onResponse(call: Call<Unit>, response: Response<Unit>) {
                    findNavController().navigate(R.id.action_signupFragment2_to_loginFragment2)

                }
                override fun onFailure(call: Call<Unit>, t: Throwable) {
                    Toast.makeText(context,"error",Toast.LENGTH_LONG).show()
                }

            })
        }

    }

    /*fun isValidForm(): Boolean{
        var isValid = true
        if(name.text.isNullOrEmpty())
        {
            name.error = getString(R.string.app_name)
            isValid=false
        }
        else{
            name.error = ""
        }
        if(email.text.isNullOrEmpty())
        {
            email.error = getString(R.string.app_name)
            isValid = false
        }
        else{
            email.error = ""
        }
        if(password.text.isNullOrEmpty())
        {
            password.error = getString(R.string.app_name)
            isValid = false
        }
        else{
            password.error = ""
        }
        return isValid
    }*/
}