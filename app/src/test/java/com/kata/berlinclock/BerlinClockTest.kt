package com.kata.berlinclock

import com.google.common.truth.Truth.assertThat
import com.kata.berlinclock.model.Hours
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

    @Test
    fun test_1_minute() {
        val result = berlinClock.getMinutes(1)

        val minutesOnTop = listOf(OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF)
        val minutesOnBottom = listOf(YELLOW, OFF, OFF, OFF)
        val expectedResult = Minutes(topColors = minutesOnTop, bottomColors = minutesOnBottom)
        assertThat(expectedResult).isEqualTo(result)
    }

    @Test
    fun test_2_minutes() {
        val result = berlinClock.getMinutes(2)

        val minutesOnTop = listOf(OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF)
        val minutesOnBottom = listOf(YELLOW, YELLOW, OFF, OFF)
        val expectedResult = Minutes(topColors = minutesOnTop, bottomColors = minutesOnBottom)
        assertThat(expectedResult).isEqualTo(result)
    }

    @Test
    fun test_3_minutes() {
        val result = berlinClock.getMinutes(3)

        val minutesOnTop = listOf(OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF)
        val minutesOnBottom = listOf(YELLOW, YELLOW, YELLOW, OFF)
        val expectedResult = Minutes(topColors = minutesOnTop, bottomColors = minutesOnBottom)
        assertThat(expectedResult).isEqualTo(result)
    }

    @Test
    fun test_4_minutes() {
        val result = berlinClock.getMinutes(4)

        val minutesOnTop = listOf(OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF)
        val minutesOnBottom = listOf(YELLOW, YELLOW, YELLOW, YELLOW)
        val expectedResult = Minutes(topColors = minutesOnTop, bottomColors = minutesOnBottom)
        assertThat(expectedResult).isEqualTo(result)
    }

    @Test
    fun test_5_minutes() {
        val result = berlinClock.getMinutes(5)

        val minutesOnTop = listOf(YELLOW, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF)
        val minutesOnBottom = listOf(OFF, OFF, OFF, OFF)
        val expectedResult = Minutes(topColors = minutesOnTop, bottomColors = minutesOnBottom)
        assertThat(expectedResult).isEqualTo(result)
    }

    @Test
    fun test_6_minutes() {
        val result = berlinClock.getMinutes(6)

        val minutesOnTop = listOf(YELLOW, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF)
        val minutesOnBottom = listOf(YELLOW, OFF, OFF, OFF)
        val expectedResult = Minutes(topColors = minutesOnTop, bottomColors = minutesOnBottom)
        assertThat(expectedResult).isEqualTo(result)
    }

    @Test
    fun test_7_minutes() {
        val result = berlinClock.getMinutes(7)

        val minutesOnTop = listOf(YELLOW, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF)
        val minutesOnBottom = listOf(YELLOW, YELLOW, OFF, OFF)
        val expectedResult = Minutes(topColors = minutesOnTop, bottomColors = minutesOnBottom)
        assertThat(expectedResult).isEqualTo(result)
    }

    @Test
    fun test_10_minutes() {
        val result = berlinClock.getMinutes(10)

        val minutesOnTop = listOf(YELLOW, YELLOW, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF)
        val minutesOnBottom = listOf(OFF, OFF, OFF, OFF)
        val expectedResult = Minutes(topColors = minutesOnTop, bottomColors = minutesOnBottom)
        assertThat(expectedResult).isEqualTo(result)
    }

    @Test
    fun test_11_minutes() {
        val result = berlinClock.getMinutes(11)

        val minutesOnTop = listOf(YELLOW, YELLOW, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF)
        val minutesOnBottom = listOf(YELLOW, OFF, OFF, OFF)
        val expectedResult = Minutes(topColors = minutesOnTop, bottomColors = minutesOnBottom)
        assertThat(expectedResult).isEqualTo(result)
    }

    @Test
    fun test_15_minutes() {
        val result = berlinClock.getMinutes(15)

        val minutesOnTop = listOf(YELLOW, YELLOW, RED, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF)
        val minutesOnBottom = listOf(OFF, OFF, OFF, OFF)
        val expectedResult = Minutes(topColors = minutesOnTop, bottomColors = minutesOnBottom)
        assertThat(expectedResult).isEqualTo(result)
    }

    @Test
    fun test_17_minutes() {
        val result = berlinClock.getMinutes(17)

        val minutesOnTop = listOf(YELLOW, YELLOW, RED, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF)
        val minutesOnBottom = listOf(YELLOW, YELLOW, OFF, OFF)
        val expectedResult = Minutes(topColors = minutesOnTop, bottomColors = minutesOnBottom)
        assertThat(expectedResult).isEqualTo(result)
    }

    @Test
    fun test_25_minutes() {
        val result = berlinClock.getMinutes(25)

        val minutesOnTop = listOf(YELLOW, YELLOW, RED, YELLOW, YELLOW, OFF, OFF, OFF, OFF, OFF, OFF)
        val minutesOnBottom = listOf(OFF, OFF, OFF, OFF)
        val expectedResult = Minutes(topColors = minutesOnTop, bottomColors = minutesOnBottom)
        assertThat(expectedResult).isEqualTo(result)
    }

    @Test
    fun test_30_minutes() {
        val result = berlinClock.getMinutes(30)

        val minutesOnTop = listOf(YELLOW, YELLOW, RED, YELLOW, YELLOW, RED, OFF, OFF, OFF, OFF, OFF)
        val minutesOnBottom = listOf(OFF, OFF, OFF, OFF)
        val expectedResult = Minutes(topColors = minutesOnTop, bottomColors = minutesOnBottom)
        assertThat(expectedResult).isEqualTo(result)
    }

    @Test
    fun test_45_minutes() {
        val result = berlinClock.getMinutes(45)

        val minutesOnTop =
            listOf(YELLOW, YELLOW, RED, YELLOW, YELLOW, RED, YELLOW, YELLOW, RED, OFF, OFF)
        val minutesOnBottom = listOf(OFF, OFF, OFF, OFF)
        val expectedResult = Minutes(topColors = minutesOnTop, bottomColors = minutesOnBottom)
        assertThat(expectedResult).isEqualTo(result)
    }

    @Test
    fun test_59_minutes() {
        val result = berlinClock.getMinutes(59)

        val minutesOnTop =
            listOf(YELLOW, YELLOW, RED, YELLOW, YELLOW, RED, YELLOW, YELLOW, RED, YELLOW, YELLOW)
        val minutesOnBottom = listOf(YELLOW, YELLOW, YELLOW, YELLOW)
        val expectedResult = Minutes(topColors = minutesOnTop, bottomColors = minutesOnBottom)
        assertThat(expectedResult).isEqualTo(result)
    }

    @Test
    fun test_0_hour() {
        val result = berlinClock.getHours(0)

        val hoursOnBottom = listOf(OFF, OFF, OFF, OFF)
        val expectedResult = Hours(bottomColors = hoursOnBottom)
        assertThat(expectedResult).isEqualTo(result)
    }

    @Test
    fun test_1_hour() {
        val result = berlinClock.getHours(1)

        val hoursOnBottom = listOf(RED, OFF, OFF, OFF)
        val expectedResult = Hours(bottomColors = hoursOnBottom)
        assertThat(expectedResult).isEqualTo(result)
    }

    @Test
    fun test_2_hours() {
        val result = berlinClock.getHours(2)

        val hoursOnBottom = listOf(RED, RED, OFF, OFF)
        val expectedResult = Hours(bottomColors = hoursOnBottom)
        assertThat(expectedResult).isEqualTo(result)
    }

    @Test
    fun test_3_hours() {
        val result = berlinClock.getHours(3)

        val hoursOnBottom = listOf(RED, RED, RED, OFF)
        val expectedResult = Hours(bottomColors = hoursOnBottom)
        assertThat(expectedResult).isEqualTo(result)
    }

    @Test
    fun test_4_hours() {
        val result = berlinClock.getHours(4)

        val hoursOnBottom = listOf(RED, RED, RED, RED)
        val expectedResult = Hours(bottomColors = hoursOnBottom)
        assertThat(expectedResult).isEqualTo(result)
    }

    @Test
    fun test_5_hours() {
        val result = berlinClock.getHours(5)

        val hoursOnTop = listOf(RED, OFF, OFF, OFF)
        val hoursOnBottom = listOf(OFF, OFF, OFF, OFF)
        val expectedResult = Hours(topColors = hoursOnTop, bottomColors = hoursOnBottom)
        assertThat(expectedResult).isEqualTo(result)
    }

    @Test
    fun test_6_hours() {
        val result = berlinClock.getHours(6)

        val hoursOnTop = listOf(RED, OFF, OFF, OFF)
        val hoursOnBottom = listOf(RED, OFF, OFF, OFF)
        val expectedResult = Hours(topColors = hoursOnTop, bottomColors = hoursOnBottom)
        assertThat(expectedResult).isEqualTo(result)
    }
}