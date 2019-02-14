package com.example.mvppuppyapi.mvp

import com.example.mvppuppyapi.model.Response

class PresenterImpl(private val mainContract: MainContract.View, private val interactor: MainContract.Interactor) : MainContract.Presenter, MainContract.Interactor.OnFinishedListener {
    override fun onFinished(modelList: List<String>) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onFailure(throwable: Throwable) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun start(breed : String) {
        interactor.loadData(this, breed)

//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}