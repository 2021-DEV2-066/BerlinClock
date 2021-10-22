package com.kata.berlinclock.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kata.berlinclock.databinding.BerlinClockItemLayoutBinding
import com.kata.berlinclock.utils.LampColor

class OneMinuteAdapter :
    RecyclerView.Adapter<OneMinuteAdapter.MyViewHolder>() {

    private lateinit var minutesOnBottomLamps: List<LampColor>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val rootView =
            BerlinClockItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(rootView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(minutesOnBottomLamps[position])
    }

    override fun getItemCount() = 4

    fun setMinutesValue(minutesOnBottomValue: List<LampColor>) {
        minutesOnBottomLamps = minutesOnBottomValue
        notifyDataSetChanged()
    }

    inner class MyViewHolder(private val binding: BerlinClockItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(minute: LampColor) {
            binding.itemBtn.isEnabled = minute != LampColor.OFF
        }
    }
}