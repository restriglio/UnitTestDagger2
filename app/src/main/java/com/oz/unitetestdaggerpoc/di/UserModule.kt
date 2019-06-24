package com.res.unitetestdaggerpoc.di

import com.res.unitetestdaggerpoc.UserRepository
import dagger.Module
import dagger.Provides

@Module
class UserModule {

    @Provides
    fun provideUserrepository() = UserRepository()

}