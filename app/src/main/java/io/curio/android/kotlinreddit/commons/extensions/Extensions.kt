package io.curio.android.kotlinreddit.commons.extensions

import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.squareup.picasso.Picasso
import io.curio.android.kotlinreddit.R

fun ViewGroup.inflate(layoutId: Int, attatchToRoot: Boolean = false): View
    = LayoutInflater.from(context).inflate(layoutId,this,attatchToRoot)

fun ImageView.loadImg(url: String){
    if(TextUtils.isEmpty(url))
        Picasso.get().load(R.mipmap.ic_launcher).into(this)
    else
        Picasso.get().load(url).into(this)
}