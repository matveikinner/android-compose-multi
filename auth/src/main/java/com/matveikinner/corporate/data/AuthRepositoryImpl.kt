package com.matveikinner.corporate.data

import com.matveikinner.corporate.data.network.models.requests.LoginRequest
import com.matveikinner.corporate.data.network.models.responses.LoginResponse
import com.matveikinner.corporate.data.remote.RemoteAuthRepository
import com.matveikinner.corporate.domain.repositories.AuthRepository
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val remoteAuthRepository: RemoteAuthRepository
): AuthRepository {

    override fun login(request: LoginRequest): LoginResponse {
        return remoteAuthRepository.login(request = request)
    }
}