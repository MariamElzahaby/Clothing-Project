package com.example.clothesproject.userApis

import com.google.gson.annotations.SerializedName

data class UserLoginRequest(

    @SerializedName("eMail"    ) var eMail    : String? = null,
    @SerializedName("password" ) var password : String? = null
)
