package com.example.clothesproject.userApis

import com.google.gson.annotations.SerializedName

data class UserDataResponse(

    @SerializedName("userId"   ) var userId   : Int?    = null,
    @SerializedName("name"     ) var name     : String? = null,
    @SerializedName("password" ) var password : String? = null,
    @SerializedName("email"    ) var email    : String? = null
)
