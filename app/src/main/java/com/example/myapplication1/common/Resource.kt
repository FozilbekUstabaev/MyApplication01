package com.example.myapplication1.common

class Resource<T>(
    val data: T,
    val message: String?,
    val status: Status
) {

    companion object {
        fun <T> success(data: T): Resource<T> {
            return Resource(data, null, Status.SUCCESS)
        }

        fun <T> loading(): Resource<T?> {
            return Resource(null, null, Status.LOADING)
        }

        fun <T> error(message: String): Resource<T?> {
            return Resource(null, message, Status.ERROR)
        }
    }

    enum class Status {
        SUCCESS,
        LOADING,
        ERROR
    }
}