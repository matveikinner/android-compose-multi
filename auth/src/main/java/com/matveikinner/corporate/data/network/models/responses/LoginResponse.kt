package com.matveikinner.corporate.data.network.models.responses

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("statusCode") val statusCode: Int
)
