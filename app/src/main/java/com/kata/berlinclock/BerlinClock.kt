package com.kata.berlinclock

import com.kata.berlinclock.model.Minutes
import com.kata.berlinclock.utils.LampColor
import com.kata.berlinclock.utils.LampColor.*

class BerlinClock {

    fun getSeconds(sec: Int): LampColor =
        if (sec.isEven()) YELLOW else OFF

    fun getMinutes(minutes: Int): Minutes = when {
        minutes.lessThanFive() -> getValueForMinutesLessThanFive(minutes)
        minutes.greaterThanFive() -> getValueForMinutesGreaterThanFive(minutes)
        else -> defaultMinutes
    }

    private fun getValueForMinutesLessThanFive(minutes: Int) =
        Minutes(
            bottomColors = getMinutesOnBottomLampColors(
                minutes,
                Minutes.defaultBottom()
            )
        )

    private fun getValueForMinutesGreaterThanFive(minutes: Int): Minutes {
        val numberOfLightsOnTopToBeTurnedON = minutes / 5
        val numberOfLightsOnBottomToBeTurnedON = minutes % 5

        val minutesOfLampsOnTop = getMinutesOfLampsOnTop(numberOfLightsOnTopToBeTurnedON)
        val minutesOnBottom =
            getMinutesOnBottomLampColors(
                numberOfLightsOnBottomToBeTurnedON,
                Minutes.defaultBottom()
            )

        return Minutes(topColors = minutesOfLampsOnTop, bottomColors = minutesOnBottom)
    }

    private fun getMinutesOfLampsOnTop(numberOfLightsOnTopToBeTurnedON: Int): List<LampColor> {
        val minutesOfLampsOnTop = Minutes.defaultTop()
        (1..numberOfLightsOnTopToBeTurnedON).forEach { i ->
            minutesOfLampsOnTop[i - 1] = YELLOW
        }
        return minutesOfLampsOnTop
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

    private fun Int.greaterThanFive() = this >= 5
    private fun Int.lessThanFive() = this < 5
    private fun Int.isEven() = this % 2 == 0
}
