package com.res.unitetestdaggerpoc

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.oz.unitetestdaggerpoc.BaseActivity
import com.oz.unitetestdaggerpoc.SecondActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = userRepository.name
    }

    override fun onResume() {
        super.onResume()

        Handler().postDelayed({
            startActivity(
                Intent(this, SecondActivity::class.java)
            )
        }, 1000)


    }

}
