package com.kata.berlinclock

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.kata.berlinclock.model.BerlinClockData
import com.kata.berlinclock.model.Hours
import com.kata.berlinclock.model.Minutes
import com.kata.berlinclock.utils.LampColor.*
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.mockk
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module
import androidx.test.espresso.matcher.ViewMatchers.*
import org.hamcrest.CoreMatchers.not
import org.koin.test.KoinTest

@RunWith(AndroidJUnit4ClassRunner::class)
class BerlinClockActivityTest : KoinTest {

    private var activityScenarioRule: ActivityScenario<BerlinClockActivity>? = null

    @Before
    fun setUp() {

        MockKAnnotations.init(this, relaxUnitFun = true)

        val berlinClock = mockk<BerlinClock>()

        val expectedBerlinTime = expectedBerlinClockData()

        every { berlinClock.getBerlinClock(any()) } returns expectedBerlinTime

        loadKoinModules(
            listOf(
                module { single(override = true) { berlinClock } },
                viewModelModule
            )
        )

        activityScenarioRule = ActivityScenario.launch(BerlinClockActivity::class.java)
    }

    @Test
    fun check_if_all_views_are_visible() {
        onView(withId(R.id.seconds_layout)).check(matches(isDisplayed()))

        onView(withId(R.id.tv_time)).check(matches((not(withText(" ")))))

        onView(withId(R.id.rv_minutes_of_top_lamp))
            .check(matches(hasChildCount(11)))

        onView(withId(R.id.rv_minutes_of_bottom_lamp))
            .check(matches(hasChildCount(4)))

        onView(withId(R.id.rv_hours_lamp))
            .check(matches(hasChildCount(8)))
    }

    private fun expectedBerlinClockData(): BerlinClockData {
        val hoursOnTop = listOf(RED, RED, OFF, OFF)
        val hoursOnBottom = listOf(RED, RED, RED, OFF)
        val minutesOnTop = listOf(YELLOW, YELLOW, RED, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF)
        val minutesOnBottom = listOf(YELLOW, YELLOW, OFF, OFF)
        return BerlinClockData(
            hoursOnLamps = Hours(topColors = hoursOnTop, bottomColors = hoursOnBottom),
            minutesOnLamps = Minutes(topColors = minutesOnTop, bottomColors = minutesOnBottom),
            secondsOnLamp = OFF
        )
    }
}