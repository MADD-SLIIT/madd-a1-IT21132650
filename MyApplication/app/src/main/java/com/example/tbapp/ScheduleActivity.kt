package com.example.tbapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tbapp.adapter.ScheduleAdapter
import com.example.tbapp.model.ScheduleItem

class ScheduleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewSchedule)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val scheduleItems = listOf(
            ScheduleItem("Galle Fort Hotel", "26 October 2024", "28 Church St, Galle 80000", R.drawable.image_galle_fort_hotel),
            ScheduleItem("The Fort Printers", "26 October 2024", "28 Church St, Galle 80000", R.drawable.image_fort_printers),
            ScheduleItem("Mango House", "26 October 2024", "28 Church St, Galle 80000", R.drawable.image_mango_house)
        )

        recyclerView.adapter = ScheduleAdapter(scheduleItems)
    }
}
