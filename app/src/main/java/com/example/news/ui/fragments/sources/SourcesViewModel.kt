package com.example.news.ui.fragments.sources

import com.example.news.base.BaseViewModel
import com.example.news.data.repositories.EverythingRepository
import com.example.news.date.repositories.Everything
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlin.text.Typography.dagger

@HiltViewModel
class SourcesViewModel@Inject constructor(private val repository: Everything): BaseViewModel() {
    fun fetchSources() = repository.fetchSources()
}