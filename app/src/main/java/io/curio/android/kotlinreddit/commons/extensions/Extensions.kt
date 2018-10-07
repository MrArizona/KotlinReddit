package io.curio.android.kotlinreddit.commons.extensions

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

fun ViewGroup.inflate(layoutId: Int, attatchToRoot: Boolean = false): View
    = LayoutInflater.from(context).inflate(layoutId,this,attatchToRoot)

