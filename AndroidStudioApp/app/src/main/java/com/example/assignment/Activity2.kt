package com.example.assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val Activity3Btn: Button = findViewById(R.id.Activity3Btn)

        Activity3Btn.setOnClickListener {
            val intent = Intent(this,Activity3::class.java)
            startActivity(intent)
        }
    }
}