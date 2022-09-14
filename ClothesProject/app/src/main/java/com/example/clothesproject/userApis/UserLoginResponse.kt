package com.example.clothesproject.userApis

import com.google.gson.annotations.SerializedName

data class UserLoginResponse(

    @SerializedName("user_Id" ) var userId : Int?    = null,
    @SerializedName("e_Mail"  ) var eMail  : String? = null,
    @SerializedName("name"    ) var name   : String? = null

)
