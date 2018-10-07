package io.curio.android.kotlinreddit.commons.data

import io.curio.android.kotlinreddit.commons.adapters.AdapterConstants
import io.curio.android.kotlinreddit.commons.adapters.ViewType

data class RedditNewsItem(var author: String,
                          var title: String,
                          val numComments: Int,
                          val created: Long,
                          val thumbnail: String,
                          val url: String?): ViewType {
    override fun getViewType(): Int = AdapterConstants.NEWS
}