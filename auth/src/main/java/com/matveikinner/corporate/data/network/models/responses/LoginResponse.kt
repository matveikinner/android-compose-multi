package com.matveikinner.corporate.data.network.models.responses

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("token") val token: String
)
