package com.maxline.step00

import org.junit.Assert.assertEquals
import org.junit.Test as test

class DummyTest {
    @test fun greeting_ShouldReturnDummyGreeting() {
        val dummy = Dummy()
        assertEquals("hello from Dummy", dummy.greeting())
    }
}