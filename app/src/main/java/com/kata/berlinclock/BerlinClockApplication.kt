package com.kata.berlinclock

import android.app.Application
import org.koin.core.context.startKoin
import org.koin.dsl.module

class BerlinClockApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(listOf(appModule))
        }
    }
}

val appModule = module {
    single { BerlinClock() }
}