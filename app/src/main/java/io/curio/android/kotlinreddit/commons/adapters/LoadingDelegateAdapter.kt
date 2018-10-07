package io.curio.android.kotlinreddit.commons.adapters

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import io.curio.android.kotlinreddit.R
import io.curio.android.kotlinreddit.commons.extensions.inflate

class LoadingDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup) = TurnsViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(parent.inflate(R.layout.news_item_loading))

}