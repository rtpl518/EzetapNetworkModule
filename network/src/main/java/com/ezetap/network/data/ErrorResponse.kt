package com.ezetap.network.data

import com.ezetap.network.constants.ErrorCode

data class ErrorResponse(val errorCode: ErrorCode, val error: String?)