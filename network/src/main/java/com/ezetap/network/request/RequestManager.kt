package com.ezetap.network.request

import com.ezetap.network.config.ApiService
import com.ezetap.network.data.*
import com.google.gson.Gson
import javax.inject.Inject

class RequestManager @Inject constructor(private val apiService: ApiService) {

    suspend fun fetchCustomUI(): ResponseModel<Any> {
        with(NetworkRouter.invokeApiCall { apiService.fetchCustomUI() }) {
            return when (this) {
                is ResultType.Success -> ResponseModel(
                    Gson().fromJson(
                        data,
                        CustomUIResponse::class.java
                    ), null
                )
                is ResultType.Error -> ResponseModel(null, data)
            }
        }
    }

    suspend fun fetchImage(): ResponseModel<Any> {
        with(NetworkRouter.invokeApiCall { apiService.fetchImage() }) {
            return when (this) {
                is ResultType.Success -> ResponseModel(
                    Gson().fromJson(
                        data,
                        ImageResponse::class.java
                    ), null
                )
                is ResultType.Error -> ResponseModel(null, data)
            }
        }
    }
}