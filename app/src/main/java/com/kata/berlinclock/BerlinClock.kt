package com.kata.berlinclock

import com.kata.berlinclock.model.Minutes
import com.kata.berlinclock.utils.LampColor
import com.kata.berlinclock.utils.LampColor.*

class BerlinClock {

    fun getSeconds(sec: Int): LampColor =
        if (sec % 2 == 0) YELLOW else OFF

    fun getMinutes(minutes: Int): Minutes {
        return Minutes()
    }
}