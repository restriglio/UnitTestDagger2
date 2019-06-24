package com.res.unitetestdaggerpoc

import javax.inject.Inject

abstract class BaseTest {

    lateinit var testAppComponent: TestAppComponent

    @Inject
    lateinit var userRepository: UserRepository


    init {
        DaggerTestAppComponent.builder().build().inject(this)
    }
}