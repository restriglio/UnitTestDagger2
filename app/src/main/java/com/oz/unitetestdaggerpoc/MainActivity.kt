package com.res.unitetestdaggerpoc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.res.unitetestdaggerpoc.di.DaggerAppComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {


    @Inject
    lateinit var repo: UserRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerAppComponent.builder().build().inject(this)
    }

    override fun onResume() {
        super.onResume()

        Toast.makeText(this, repo.name, Toast.LENGTH_SHORT).show()
    }
}
