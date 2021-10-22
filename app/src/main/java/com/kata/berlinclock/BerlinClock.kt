package com.kata.berlinclock

import com.kata.berlinclock.model.Minutes
import com.kata.berlinclock.utils.LampColor
import com.kata.berlinclock.utils.LampColor.*

class BerlinClock {

    fun getSeconds(sec: Int): LampColor =
        if (sec % 2 == 0) YELLOW else OFF

    fun getMinutes(minutes: Int): Minutes {
        return when (minutes) {
            in 1..4 -> Minutes(
                bottomColors = getMinutesOnBottomLampColors(
                    minutes,
                    Minutes.defaultBottom()
                )
            )
            5 -> {
                val minutesOnTop = listOf(YELLOW, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF, OFF)
                Minutes(topColors = minutesOnTop, bottomColors = Minutes.defaultBottom())
            }
            else -> defaultMinutes
        }
    }

    private fun getMinutesOnBottomLampColors(
        minutes: Int,
        lampColor: MutableList<LampColor>
    ): List<LampColor> {
        (1..minutes).forEach { i ->
            lampColor[i - 1] = YELLOW
        }
        return lampColor
    }

    private val defaultMinutes get() = Minutes()
}
