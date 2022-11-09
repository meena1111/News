package com.example.news.ui.fragments.everything

import com.example.news.base.BaseRepository
import com.example.news.base.BaseViewModel
import com.example.news.data.repositories.EverythingRepository
import com.example.news.date.repositories.Everything
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlin.text.Typography.dagger

@HiltViewModel
class EverythingViewModel @Inject constructor(private val repository: Everything) :
    BaseViewModel() {

    fun fetchEverything() = repository.fetchEverything()
}