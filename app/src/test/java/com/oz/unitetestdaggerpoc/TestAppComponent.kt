package com.res.unitetestdaggerpoc

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [TestModule::class])
interface TestAppComponent {
    fun inject(baseTest: BaseTest)
}