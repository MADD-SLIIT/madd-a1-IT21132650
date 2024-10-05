package com.example.tbapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val destinationName = intent.getStringExtra("DESTINATION_NAME")
        val description = intent.getStringExtra("DESCRIPTION")

        val textViewName = findViewById<TextView>(R.id.textViewTitle)
        textViewName.text = destinationName

        val textViewDescription = findViewById<TextView>(R.id.textViewDescription)
        textViewDescription.text = description
    }
}
