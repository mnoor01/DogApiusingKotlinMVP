package com.example.mvppuppyapi.model


import com.google.gson.annotations.SerializedName


data class Response(

	@SerializedName("message")
	val message: List<String>,

	@SerializedName("status")
	val status: String
)