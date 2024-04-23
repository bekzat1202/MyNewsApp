package com.myself223.mynewsapp.data.remote.repository

import androidx.lifecycle.MutableLiveData
import com.myself223.mynewsapp.core.Resourese
import com.myself223.mynewsapp.data.model.EverythingDto
import com.myself223.mynewsapp.data.remote.apiService.ApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class NewsRepository @Inject constructor(private val apiService: ApiService) {

    fun getNews(newsName: String, category: String): MutableLiveData<Resourese<EverythingDto?>> {
        val liveData = MutableLiveData<Resourese<EverythingDto?>>()
        liveData.value = Resourese.Loading()

        apiService.getNews(newsName = newsName, category = category).enqueue(object : Callback<EverythingDto?> {
            override fun onResponse(
                call: Call<EverythingDto?>,
                response: Response<EverythingDto?>
            ) {
                if (response.isSuccessful && response.body() != null) {
                    liveData.value = Resourese.Success(data = response.body())
                } else {
                    liveData.value = Resourese.Error(message = response.message())
                }
            }

            override fun onFailure(call: Call<EverythingDto?>, t: Throwable) {
                liveData.value = Resourese.Error(message = t.localizedMessage)
            }
        })
        return liveData
    }
}
