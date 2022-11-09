package com.example.news.date.repositories

import com.example.news.base.BaseRepository
import com.example.news.data.remote.apiservices.NewsApiServices
import com.example.news.date.remote.apiservies.NewsApiServices
import javax.inject.Inject

class Everything @Inject constructor(private val service: NewsApiServices): BaseRepository() {

    fun fetchEverything() = doRequest {
        service.fetchEverything("bitcoin")
    }

    fun fetchTopArticles() = doRequest {
        service.fetchTopArticles("us")
    }

    fun fetchSources() = doRequest {
        service.fetchSources()
    }
}