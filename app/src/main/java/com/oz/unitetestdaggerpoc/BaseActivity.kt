package com.oz.unitetestdaggerpoc

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.res.unitetestdaggerpoc.UserRepository
import com.res.unitetestdaggerpoc.di.DaggerAppComponent
import javax.inject.Inject

open class BaseActivity : AppCompatActivity() {


    @Inject
    protected lateinit var userRepository: UserRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerAppComponent.builder().build().inject(this)
    }

}