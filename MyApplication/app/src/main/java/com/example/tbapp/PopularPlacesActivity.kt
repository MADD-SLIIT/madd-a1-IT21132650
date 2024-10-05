package com.tbapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tbapp.adapter.PopularPlacesAdapter
import com.tbapp.model.PopularPlace

class PopularPlacesActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: PopularPlacesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popular_places)

        recyclerView = findViewById(R.id.recyclerViewPopularPlaces)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        // Example Data
        val places = listOf(
            PopularPlace(R.drawable.galle_fort, "Galle Fort Hotel", "28 Church St, Galle", 4.7, "$459/Person", true),
            PopularPlace(R.drawable.galle_fort, "Galle Fort Hotel", "28 Church St, Galle", 4.8, "$894/Person", false),
            // Add more places here...
        )

        adapter = PopularPlacesAdapter(places)
        recyclerView.adapter = adapter
    }
}

