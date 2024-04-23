package com.myself223.mynewsapp.core

sealed class Resourese<T>(val data: T? = null, val message: String? = null) {
    class Loading<T> : Resourese<T>()
    class Success<T>(data: T) : Resourese<T>(data = data)
    class Error<T>(message: String): Resourese<T>(message = message)
}
