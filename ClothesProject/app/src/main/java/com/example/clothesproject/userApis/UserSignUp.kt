package com.example.clothesproject.userApis

import com.google.gson.annotations.SerializedName

data class UserSignUp(

    @SerializedName("name"     ) var name     : String? = null,
    @SerializedName("e_Mail"   ) var eMail    : String? = null,
    @SerializedName("password" ) var password : String? = null

)

