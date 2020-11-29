package com.github.ajalt.mordant

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class MultiplatformTest {
    @Test
    fun `should work everywhere`() {
        assertTrue(true)
    }

    @Test
    fun `needs platform-specific implementation`() {
        assertEquals("Hello, Kotlin Multiplatform!", "${sayHello()}, Kotlin Multiplatform!")
    }
}

internal expect fun sayHello(): String
