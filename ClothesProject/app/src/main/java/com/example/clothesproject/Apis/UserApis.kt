package com.example.clothesproject.Apis
/*
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*


interface UserApis {

    @POST("/user/register")
    fun signUp (@Body user : User) : Call<User>

    @POST ("/user/login")
    fun login (@Body user : User) : Call<User>

    @GET("/user/profile/{userId}")
    fun getProfile (@Path ("userId") userId: Int) :  Call <User>

    @DELETE ("/user/logout/{userId}")                             // preferred to be post
    fun logout (@Path ("userId") userId: Int) :  Call <Boolean>

}

var retrofit = Retrofit.Builder()
    .baseUrl("")
    .addConverterFactory(GsonConverterFactory.create())
    .build()


var service: UserApis = retrofit.create( UserApis :: class.java )

*/