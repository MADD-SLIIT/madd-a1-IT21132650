package com.example.tbapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tbapp.R
import com.example.tbapp.model.ScheduleItem

class ScheduleAdapter(private val scheduleItems: List<ScheduleItem>) : RecyclerView.Adapter<ScheduleAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.itemImageView)
        val nameTextView: TextView = view.findViewById(R.id.itemNameTextView)
        val dateTextView: TextView = view.findViewById(R.id.itemDateTextView)
        val addressTextView: TextView = view.findViewById(R.id.itemAddressTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.schedule_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = scheduleItems[position]
        holder.imageView.setImageResource(item.imageResId)
        holder.nameTextView.text = item.name
        holder.dateTextView.text = item.date
        holder.addressTextView.text = item.address
    }

    override fun getItemCount(): Int = scheduleItems.size
}
