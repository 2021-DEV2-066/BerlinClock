package com.kata.berlinclock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kata.berlinclock.databinding.ActivityBerlinClockBinding

class BerlinClockActivity : AppCompatActivity() {
    private var _binding: ActivityBerlinClockBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityBerlinClockBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}