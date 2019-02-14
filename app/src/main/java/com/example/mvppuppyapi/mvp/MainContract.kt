package com.example.mvppuppyapi.mvp

import com.example.mvppuppyapi.model.Response

interface MainContract {
    interface View{
        fun putDataToRecyclerview(data : List<String>)
    }
    interface Presenter {
        fun start(breed : String)
    }
    interface Interactor{
        fun loadData(onFinishedListener: OnFinishedListener, breed : String)
        interface OnFinishedListener {
            fun onFinished(modelList : List<String>)
            fun onFailure(throwable: Throwable)
        }
    }
}