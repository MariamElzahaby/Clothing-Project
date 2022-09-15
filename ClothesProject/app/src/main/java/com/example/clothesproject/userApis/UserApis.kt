package com.example.clothesproject.userApis

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*


interface UserApis {

    @POST("user/register")
    fun signUp (@Body userSignUp : UserSignUp) : Call<Unit>  //type of call back?

    @POST ("user/login")
    fun login (@Body userLoginRequest: UserLoginRequest) : Call<UserLoginResponse>

    @GET("user/profile/{userId}")
    fun getProfile (@Path ("userId") userId: Int) :  Call <UserDataResponse>

    @DELETE ("user/logout/{userId}")                         // preferred to be post
    fun logout (@Path ("userId") userId: Int) : Call<Unit>


}

var retrofit = Retrofit.Builder()
    .baseUrl("https://clothesapplication.herokuapp.com/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()


var service: UserApis = retrofit.create( UserApis :: class.java)

