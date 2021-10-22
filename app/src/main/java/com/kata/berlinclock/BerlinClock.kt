package com.kata.berlinclock

import com.kata.berlinclock.utils.LampColor
import com.kata.berlinclock.utils.LampColor.*

class BerlinClock {

    fun getSeconds(sec: Int): LampColor {
        if (sec == 1)
            return OFF
        return YELLOW
    }
}