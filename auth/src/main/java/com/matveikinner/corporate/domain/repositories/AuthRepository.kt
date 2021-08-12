package com.matveikinner.corporate.domain.repositories

import com.matveikinner.corporate.data.network.models.requests.LoginRequest
import com.matveikinner.corporate.data.network.models.responses.LoginResponse

interface AuthRepository {
    fun login(request: LoginRequest): LoginResponse
}