package com.example.loginform

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val textV: TextView = findViewById(R.id.textV)

        val intent: Intent = intent
        var user = intent.getStringExtra("username")
        var pass = intent.getStringExtra("password")

        textV.setText(user + " " + pass)

    }
}