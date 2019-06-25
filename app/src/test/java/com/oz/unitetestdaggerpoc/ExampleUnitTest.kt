package com.res.unitetestdaggerpoc

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest : BaseTest() {


    init {
        DaggerTestAppComponent.builder().build().inject(this)
    }

    @Test
    fun isNameCorrect() {
        assertEquals(userRepository.name, "Repo")
    }

    @Test
    fun isNameNotCorrect() {
        assertEquals(userRepository.name, "Pepito")
    }


}
