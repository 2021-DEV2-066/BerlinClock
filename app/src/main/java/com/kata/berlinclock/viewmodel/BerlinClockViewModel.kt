package com.kata.berlinclock.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kata.berlinclock.BerlinClock
import com.kata.berlinclock.model.BerlinClockData

class BerlinClockViewModel(private val berlinClock: BerlinClock) : ViewModel() {

    private var _berlinClockTime = MutableLiveData<BerlinClockData>()
    val berlinClockTime: LiveData<BerlinClockData> = _berlinClockTime

    fun updateBerlinClockInitialState() {
        _berlinClockTime.postValue(BerlinClockData.initial())
    }
}