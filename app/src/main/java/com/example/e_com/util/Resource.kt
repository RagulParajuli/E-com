package com.example.e_com.util

sealed class Resource <T>(
    val data: T? = null,
    val message: String? = null,
){
    // when operation is success
    class Success<T>(data: T) : Resource<T>(data)
    // for Error message
    class Error<T>(message: String) : Resource<T>(message = message)
    // for loading state
    class Loading<T> : Resource<T>()
}