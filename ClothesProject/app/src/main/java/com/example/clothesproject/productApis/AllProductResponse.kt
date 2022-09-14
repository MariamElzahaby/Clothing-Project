package com.example.clothesproject.productApis

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class AllProductResponse(

    @SerializedName("proId" ) var proId : Int?    = null,
    @SerializedName("name"  ) var name  : String? = null,
    @SerializedName("price" ) var price : Int?    = null,
    @SerializedName("image" ) var image : String? = null

) : Serializable
