package com.matveikinner.corporate.data.remote

import com.matveikinner.corporate.data.network.api.AuthAPI
import com.matveikinner.corporate.data.network.models.requests.LoginRequest
import com.matveikinner.corporate.data.network.models.responses.LoginResponse
import com.matveikinner.corporate.domain.repositories.AuthRepository
import com.matveikinner.corporate.domain.utils.Resource
import dagger.hilt.android.scopes.ActivityScoped
import retrofit2.Call
import timber.log.Timber
import javax.inject.Inject

class RemoteAuthRepository @Inject constructor(
    private val authAPI: AuthAPI
): AuthRepository {

    override suspend fun login(request: LoginRequest): Resource<LoginResponse> {
        val response = try {
            authAPI.login(request)
        } catch (e: Exception) {
            return Resource.Error("Error while attempting to login")
        }

        return Resource.Success(response)
    }
}