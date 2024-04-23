package com.myself223.mynewsapp.data.model


data class ArticlesDto (
    val source : SourceDto,
    val author : String,
    val title : String,
    val description : String,
    val url : String,
    val urlToImage : String,
    val publishedAt : String,
    val content : String

)
