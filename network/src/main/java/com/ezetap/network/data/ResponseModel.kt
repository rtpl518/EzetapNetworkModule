package com.ezetap.network.data

data class ResponseModel<T>(
    val result: T?,
    val errorResponse: ErrorResponse?
)
