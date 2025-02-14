package org.example

import org.junit.Assume
import org.junit.Test

class MyTest {
    @Test
    fun doingATest() {
        Assume.assumeTrue("Oh no that is not what i want", false)
    }

    @Test
    fun doingATestThatFails() {
        assert(false) { "OH no" }
    }

    @Test
    fun doingATestThatPasses() {
        assert(true)
    }
}