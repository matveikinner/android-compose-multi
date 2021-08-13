package com.matveikinner.corporate.presentation.login

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.matveikinner.corporate.domain.usecases.LoginUseCase
import com.matveikinner.corporate.domain.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val loginUseCase: LoginUseCase
): ViewModel() {
    var token = mutableStateOf("")

    fun login() {
        viewModelScope.launch {
            val response = loginUseCase.invoke(
                LoginUseCase.Input(
                    email = "eve.holt@reqres.in",
                    password = "cityslicka"
                )
            )

            when(response) {
                is Resource.Success -> token.value = response.data?.token ?: ""
                is Resource.Error -> token.value = "Error"
            }
        }
    }
}