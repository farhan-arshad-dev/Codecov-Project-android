package com.project.codecov

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class UtilsUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun isOddNumberTest() {
        assertEquals(true, Utils.isOddNumber(97))
    }

    @Test
    fun isEvenNumberTest() {
        assertEquals(false, Utils.isOddNumber(88))
    }
}