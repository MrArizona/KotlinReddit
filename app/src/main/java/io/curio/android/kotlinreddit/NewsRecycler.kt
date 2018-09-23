package io.curio.android.kotlinreddit

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

class NewsRecycler(val items: List<NewsViewHolder>, val c: Context): RecyclerView.Adapter<NewsRecycler.NewsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    class NewsViewHolder(val itemView: View): RecyclerView.ViewHolder(itemView){

    }

}