package com.kata.berlinclock

import com.google.common.truth.Truth.assertThat
import com.kata.berlinclock.utils.LampColor.*
import org.junit.Test

class BerlinClockTest {

    private val berlinClock = BerlinClock()

    @Test
    fun test_0_second_should_return_yellow_lamp_color() {
        val result = berlinClock.getSeconds(0)

        val expectedResult = YELLOW
        assertThat(expectedResult).isEqualTo(result)
    }

    @Test
    fun test_1_second_should_return_off_lamp_color() {
        val result = berlinClock.getSeconds(1)

        val expectedResult = OFF
        assertThat(expectedResult).isEqualTo(result)
    }

    @Test
    fun test_2_seconds_should_return_yellow_lamp_color() {
        val result = berlinClock.getSeconds(2)

        val expectedResult = YELLOW
        assertThat(expectedResult).isEqualTo(result)
    }

    @Test
    fun test_random_even_seconds_should_return_yellow() {
        val result = berlinClock.getSeconds(36)

        val expectedResult = YELLOW
        assertThat(expectedResult).isEqualTo(result)
    }
}