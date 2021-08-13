package com.matveikinner.corporate.domain.usecases

import com.matveikinner.corporate.data.network.models.requests.LoginRequest
import com.matveikinner.corporate.data.network.models.responses.LoginResponse
import com.matveikinner.corporate.domain.repositories.AuthRepository
import com.matveikinner.corporate.domain.utils.Resource
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val authRepository: AuthRepository
) {
    data class Input(
        val email: String,
        val password: String
    )

    suspend fun invoke(input: Input): Resource<LoginResponse> {
        return authRepository.login(
            LoginRequest(
                email = input.email,
                password = input.password
            )
        )
    }
}