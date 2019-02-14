package com.example.mvppuppyapi.mvp

import com.example.mvppuppyapi.model.Response
import com.example.mvppuppyapi.networking.RetrofitInstance
import com.example.mvppuppyapi.recyclerviewStuff.PetRecyclerview
import retrofit2.Call
import retrofit2.Callback

class InteractorImpl : MainContract.Interactor {
    private lateinit var urls : List<String>
    private lateinit var  adapter : PetRecyclerview

    override fun loadData(onFinishedListener: MainContract.Interactor.OnFinishedListener, breed : String) {
        val dogApi=RetrofitInstance.retrofitInstance()
        dogApi.getPic(breed).enqueue(object : Callback<Response>{
            override fun onFailure(call: Call<Response>, t: Throwable) {
                onFinishedListener.onFailure(t)
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onResponse(call: Call<Response>, response: retrofit2.Response<Response>) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                response.body()?.let {
                    fun (data: Response): Unit {
                        urls=data.message
                        onFinishedListener.onFinished(urls)
                        adapter=PetRecyclerview(urls)




                    } }
            }
        })

//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}