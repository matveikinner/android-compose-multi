package com.matveikinner.corporate.data.network.api

import com.matveikinner.corporate.data.network.models.requests.LoginRequest
import com.matveikinner.corporate.data.network.models.responses.LoginResponse
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path

interface AuthAPI {

    @POST("v{version}/api/auth/login")
    fun login(
        @Path("version") version: Int,
        @Body request: LoginRequest
    ): LoginResponse
}