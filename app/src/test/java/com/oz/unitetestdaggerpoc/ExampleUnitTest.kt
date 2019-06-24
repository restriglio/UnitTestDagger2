package com.res.unitetestdaggerpoc

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest : BaseTest() {

    @Test
    fun isNameCorrect() {
        assertEquals(userRepository.name, "Rulo")
    }

    @Test
    fun isNameNotCorrect() {
        assertEquals(userRepository.name, "Areturo")
    }
}
