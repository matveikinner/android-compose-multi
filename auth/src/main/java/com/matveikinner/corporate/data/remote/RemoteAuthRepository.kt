package com.matveikinner.corporate.data.remote

import com.matveikinner.corporate.data.network.api.AuthAPI
import com.matveikinner.corporate.data.network.models.requests.LoginRequest
import com.matveikinner.corporate.data.network.models.responses.LoginResponse
import com.matveikinner.corporate.domain.repositories.AuthRepository
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class RemoteAuthRepository @Inject constructor(
    private val authAPI: AuthAPI
): AuthRepository {

    override fun login(request: LoginRequest): LoginResponse {
        try {
            return authAPI.login(1, request)
        } catch (e: Exception) {
            // TODO: Implement error handling
            throw e;
        }
    }
}