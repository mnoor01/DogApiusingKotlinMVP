package com.example.mvppuppyapi.recyclerviewStuff

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.mvppuppyapi.R
import com.example.mvppuppyapi.model.Response
import com.squareup.picasso.Picasso

class PetRecyclerview(val url : List<String>) : RecyclerView.Adapter<PetRecyclerview.PetViewholder>() {



    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): PetViewholder {

        return PetViewholder(LayoutInflater.from(p0.context).inflate(R.layout.pet_itemview, p0, false))
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return url.size
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(p0: PetViewholder, p1: Int) {

        p0.putImage(url,p1)
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }



    class PetViewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
         private lateinit var context: Context
        val petImage: ImageView = itemView.findViewById(R.id.petPic)

        fun putImage(lists:List<String>,i : Int) {
            Picasso.with(context).load(lists.get(i)).into(petImage)


        }
    }
}