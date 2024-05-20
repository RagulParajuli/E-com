package com.example.e_com.di

import com.google.firebase.auth.FirebaseAuth
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class) // creating on Instance throughout the whole app
object AppModule {
    @Provides // to provide new dependency
    @Singleton // create one instance throughout the whole app
    fun provideFirebaseAuth() = FirebaseAuth.getInstance() // provide dependency fun to constructor of RegisterViewModel
}
