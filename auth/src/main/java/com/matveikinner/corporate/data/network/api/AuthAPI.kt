package com.matveikinner.corporate.data.network.api

import com.matveikinner.corporate.data.network.models.requests.LoginRequest
import com.matveikinner.corporate.data.network.models.responses.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path

interface AuthAPI {

    @POST("api/login")
    suspend fun login(
        @Body request: LoginRequest
    ): LoginResponse
}