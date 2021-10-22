package com.kata.berlinclock

import android.app.Application
import org.koin.core.context.startKoin

class BerlinClockTestApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(listOf())
        }
    }
}