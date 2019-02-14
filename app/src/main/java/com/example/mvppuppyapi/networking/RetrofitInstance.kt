package com.example.mvppuppyapi.networking

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    fun retrofitInstance(): ApiCall {
    val retrofitInstance=Retrofit.Builder().addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .client(OkHttpClient().newBuilder().addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)).build())
        .addConverterFactory(GsonConverterFactory.create()).baseUrl("https://dog.ceo/").build()
        return retrofitInstance.create(ApiCall::class.java)
    }
}