package com.example.clothesproject.Apis

import com.google.gson.annotations.SerializedName

data class User(

    @SerializedName("f_name") val fName: String,
    @SerializedName("l_name") val lName: String,
    @SerializedName("e_Mail") val eMail: String,
    @SerializedName("password") val password: String

)

