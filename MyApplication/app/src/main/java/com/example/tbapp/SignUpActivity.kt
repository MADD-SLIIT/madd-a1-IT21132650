package com.example.tbapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val buttonSignUp = findViewById<Button>(R.id.buttonSignUp)
        buttonSignUp.setOnClickListener {
            // Assume signUpUser() validates and registers the user successfully
            if (signUpUser()) { // Placeholder method to handle sign-up logic
                navigateToHomePage()
            }
        }

        val textSignIn = findViewById<TextView>(R.id.textSignIn)
        textSignIn.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }

    private fun signUpUser(): Boolean {
        // TODO: Implement your sign-up logic here
        // This should involve validating the user's input data and registering the user
        // Return true if the registration is successful, false otherwise
        return true // This is just a placeholder for demonstration
    }

    private fun navigateToHomePage() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish() // Close SignUpActivity once the user navigates away
    }
}
