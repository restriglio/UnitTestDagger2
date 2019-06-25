package com.res.unitetestdaggerpoc.di

import com.oz.unitetestdaggerpoc.BaseActivity
import com.res.unitetestdaggerpoc.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [UserModule::class])
interface AppComponent {
    fun inject(baseActivity: BaseActivity)
}