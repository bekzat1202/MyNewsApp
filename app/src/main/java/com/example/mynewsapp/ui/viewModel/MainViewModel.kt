package com.saliev1353.newsApp.ui.viewModel


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.myself223.mynewsapp.core.Resourese
import com.myself223.mynewsapp.data.model.EverythingDto
import com.myself223.mynewsapp.data.remote.repository.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repo: NewsRepository
): ViewModel() {

   private var _livedata = MutableLiveData<Resourese<EverythingDto?>>()
    val livedata get() = _livedata

    fun getNews(name: String, category: String) {
        _livedata = repo.getNews(newsName = name, category = category )
    }


}
