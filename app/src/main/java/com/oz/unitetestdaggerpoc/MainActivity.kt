package com.res.unitetestdaggerpoc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.res.unitetestdaggerpoc.di.DaggerAppComponent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerAppComponent.builder().build().inject(this)
    }
}
