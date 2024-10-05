package com.example.tbapp
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class Onboard2Activity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_onboard_2)

            val buttonGetStarted = findViewById<Button>(R.id.buttonGetStarted)
            buttonGetStarted.setOnClickListener {
                // Intent to navigate to the main activity or the next onboard screen
                val intent = Intent(this, Onboard3Activity::class.java)
                startActivity(intent)
            }
        }
    }