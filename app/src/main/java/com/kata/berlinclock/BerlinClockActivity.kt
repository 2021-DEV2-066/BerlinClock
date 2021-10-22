package com.kata.berlinclock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kata.berlinclock.databinding.ActivityBerlinClockBinding
import com.kata.berlinclock.viewmodel.BerlinClockViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class BerlinClockActivity : AppCompatActivity() {
    private var _binding: ActivityBerlinClockBinding? = null
    private val binding get() = _binding!!

    private val viewModel: BerlinClockViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityBerlinClockBinding.inflate(layoutInflater)
        setContentView(binding.root)
        observeViewModel()
    }

    private fun observeViewModel() {
        viewModel.berlinClockTime.observe(this) {

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}