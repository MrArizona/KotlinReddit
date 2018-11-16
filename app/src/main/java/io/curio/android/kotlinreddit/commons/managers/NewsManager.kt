package io.curio.android.kotlinreddit.commons.managers

import io.curio.android.kotlinreddit.api.RestAPI
import io.curio.android.kotlinreddit.commons.data.RedditNews
import io.curio.android.kotlinreddit.commons.data.RedditNewsItem
import io.reactivex.Single
import io.reactivex.Observable
import java.util.*

class NewsManager(private val api: RestAPI = RestAPI()) {

    fun getNews(limit: String = "10"): Observable<List<RedditNewsItem>> {
        return Observable.create { subscriber ->
            val callResponse = api.getNews("", limit)
            val response = callResponse.execute()

            if (response.isSuccessful) {
                val news = response.body()!!.data.children.map {
                    val item = it.data
                    RedditNewsItem(item.author, item.title, item.num_comments,
                            item.created, item.thumbnail, item.url)
                }
                subscriber.onNext(news)
            } else {
                subscriber.onError(Throwable(response.message()))
            }
        }
    }
}