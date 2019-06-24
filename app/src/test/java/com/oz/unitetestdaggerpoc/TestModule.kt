package com.res.unitetestdaggerpoc

import dagger.Module
import dagger.Provides

@Module
class TestModule {

    @Provides
    fun provideUserrepository() = UserRepository()
}