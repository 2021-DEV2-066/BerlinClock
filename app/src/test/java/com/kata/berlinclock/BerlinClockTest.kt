package com.kata.berlinclock

import com.google.common.truth.Truth.assertThat
import com.kata.berlinclock.model.Minutes
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

    @Test
    fun test_random_odd_seconds_should_return_off() {
        val result = berlinClock.getSeconds(39)

        val expectedResult = OFF
        assertThat(expectedResult).isEqualTo(result)
    }

    @Test
    fun test_0_minute() {
        val result = berlinClock.getMinutes(0)

        val minutesOnTop = listOf(OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF)
        val minutesOnBottom = listOf(OFF, OFF, OFF, OFF)
        val expectedResult = Minutes(topColors = minutesOnTop, bottomColors = minutesOnBottom)
        assertThat(expectedResult).isEqualTo(result)
    }
}