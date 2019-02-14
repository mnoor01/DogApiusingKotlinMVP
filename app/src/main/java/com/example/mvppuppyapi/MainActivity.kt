package com.example.mvppuppyapi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import com.example.mvppuppyapi.mvp.InteractorImpl
import com.example.mvppuppyapi.mvp.MainContract
import com.example.mvppuppyapi.mvp.PresenterImpl
import com.example.mvppuppyapi.recyclerviewStuff.PetRecyclerview
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.View,MainContract.Interactor.OnFinishedListener {

private val urls= mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpRecyclerview()
        val presenter : MainContract.Presenter = PresenterImpl(this,InteractorImpl())
        val textFromTv: EditText=findViewById(R.id.textInput)
        val text: String=textFromTv.toString()
        presenter.start("spaniel")
    }

    private fun setUpRecyclerview() {
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation=RecyclerView.VERTICAL
        petRecyclerview.layoutManager=layoutManager

//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun onFinished(modelList: List<String>) {
        val petAdapter=PetRecyclerview(modelList)
        petRecyclerview.adapter=petAdapter
        Log.d("onfinished main","it came here")

//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onFailure(throwable: Throwable) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun putDataToRecyclerview(data: List<String>) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
