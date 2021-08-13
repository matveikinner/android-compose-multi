package com.matveikinner.corporate.domain.repositories

import com.matveikinner.corporate.data.network.models.requests.LoginRequest
import com.matveikinner.corporate.data.network.models.responses.LoginResponse
import com.matveikinner.corporate.domain.utils.Resource
import retrofit2.Call

interface AuthRepository {
    suspend fun login(request: LoginRequest): Resource<LoginResponse>
}