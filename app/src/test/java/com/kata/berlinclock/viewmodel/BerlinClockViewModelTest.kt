package com.kata.berlinclock.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.google.common.truth.Truth.assertThat
import com.kata.berlinclock.BerlinClock
import com.kata.berlinclock.model.BerlinClockData
import com.kata.berlinclock.utils.getOrAwaitValue
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class BerlinClockViewModelTest {
    private val berlinClock = BerlinClock()

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var viewModel: BerlinClockViewModel

    @Before
    fun setUp() {
        viewModel = BerlinClockViewModel(berlinClock)
    }

    @Test
    fun livedata_should_return_initial_berlin_clock_data() {
        viewModel.updateBerlinClockInitialState()

        val value = viewModel.berlinClockTime.getOrAwaitValue()
        val expectedBerlinTime = BerlinClockData.initial()
        assertThat(value).isEqualTo(expectedBerlinTime)
    }
}