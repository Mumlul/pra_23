package com.example.wearapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity




class LoginActivity : ComponentActivity() {

    private lateinit var login: EditText
    private lateinit var pass: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Initialize EditText fields
        login = findViewById(R.id.login) // Replace with your actual EditText ID
        pass = findViewById(R.id.pass)   // Replace with your actual EditText ID
    }

    fun next(view: View) {
        if (login.text.toString().isNotEmpty() && pass.text.toString().isNotEmpty()&& pass.text.length>=8) {
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Заполните оба поля", Toast.LENGTH_SHORT).show()
        }
    }
}