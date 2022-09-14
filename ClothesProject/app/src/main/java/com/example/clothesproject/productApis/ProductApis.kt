package com.example.clothesproject.productApis

import com.example.clothesproject.userApis.retrofit
import retrofit2.Call
import retrofit2.http.*

interface ProductApis {

      @GET("product/getAllProducts")
      fun getAllProducts() : Call<List<AllProductResponse>>

}

var service2: ProductApis = retrofit.create( ProductApis :: class.java)