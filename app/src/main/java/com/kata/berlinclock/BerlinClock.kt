package com.kata.berlinclock

import com.kata.berlinclock.model.Minutes
import com.kata.berlinclock.utils.LampColor
import com.kata.berlinclock.utils.LampColor.*

class BerlinClock {

    fun getSeconds(sec: Int): LampColor =
        if (sec % 2 == 0) YELLOW else OFF

    fun getMinutes(minutes: Int): Minutes {
        return when (minutes) {
            1 -> Minutes(bottomColors = listOf(YELLOW, OFF, OFF, OFF))
            2 -> Minutes(bottomColors = listOf(YELLOW, YELLOW, OFF, OFF))
            3 -> Minutes(bottomColors = listOf(YELLOW, YELLOW, YELLOW, OFF))
            4 -> Minutes(bottomColors = listOf(YELLOW, YELLOW, YELLOW, YELLOW))
            else -> defaultMinutes
        }
    }

    private val defaultMinutes get() = Minutes()
}
