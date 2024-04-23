package com.myself223.mynewsapp.data.model


data class EverythingDto(
    val status : String,
    val totalResults : Int,
    val articles : List<ArticlesDto>
)
