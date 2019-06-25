package com.oz.unitetestdaggerpoc

import android.os.Bundle
import com.res.unitetestdaggerpoc.R
import kotlinx.android.synthetic.main.activity_main.*

class SecondActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        textView.text = userRepository.name + " Second Activity"
    }

}