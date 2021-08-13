package com.matveikinner.corporate.di.modules

import com.matveikinner.corporate.data.network.api.AuthAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ViewModelComponent
import retrofit2.Retrofit

@Module
@InstallIn(ViewModelComponent::class)
object AuthNetworkModule {
    @Provides
    fun provideAuthAPI(retrofit: Retrofit): AuthAPI =
        retrofit.create(AuthAPI::class.java)
}