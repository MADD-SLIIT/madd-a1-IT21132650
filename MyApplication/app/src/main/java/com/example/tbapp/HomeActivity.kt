package com.example.tbapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val imageView = findViewById<ImageView>(R.id.bestDestination)
        imageView.setOnClickListener {
            navigateToDetails("Galle Fort", "Located on the southwestern coast of Sri Lanka, is a UNESCO World Heritage site and a vibrant cultural and historical landmark. Built initially by the Portuguese in the 16th century and later fortified by the Dutch in the 17th century, Galle.... Read More")
        }
    }

    private fun navigateToDetails(destinationName: String, description: String) {
        val intent = Intent(this, DetailsActivity::class.java)
        intent.putExtra("DESTINATION_NAME", destinationName)
        intent.putExtra("DESCRIPTION", description)
        startActivity(intent)
    }
}
