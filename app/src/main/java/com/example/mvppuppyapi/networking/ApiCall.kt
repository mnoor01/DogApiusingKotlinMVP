package com.example.mvppuppyapi.networking

import com.example.mvppuppyapi.model.Response
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiCall {
    @GET("api/breed/{breed-name}/images/random")
    fun getBreed(@Path("breed-name") breedName : String) : Call<Response>

    @GET("api/breed/{breed-name}/images")
    fun getPic(@Path("breed-name") image : String) : Call<Response>
}