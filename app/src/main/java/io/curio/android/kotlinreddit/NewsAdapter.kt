package io.curio.android.kotlinreddit

import android.content.Context
import android.support.v4.util.SparseArrayCompat
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import io.curio.android.kotlinreddit.commons.adapters.AdapterConstants
import io.curio.android.kotlinreddit.commons.adapters.LoadingDelegateAdapter
import io.curio.android.kotlinreddit.commons.adapters.ViewType
import io.curio.android.kotlinreddit.commons.adapters.ViewTypeDelegateAdapter



class NewsAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    private var delegateAdapters = SparseArrayCompat<ViewTypeDelegateAdapter>()
    private var items = ArrayList<ViewType>();
    private var loadingItem = object : ViewType{
        override fun getViewType(): Int = AdapterConstants.LOADING
    }

    init {
        delegateAdapters.put(AdapterConstants.LOADING, LoadingDelegateAdapter())
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return delegateAdapters.get(viewType).onCreateViewHolder(parent)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        delegateAdapters.get(getItemViewType(position)).onBindViewHolder(holder, this.items[position])
    }

    override fun getItemViewType(position: Int): Int {
        return this.items.get(position).getViewType()
    }
}