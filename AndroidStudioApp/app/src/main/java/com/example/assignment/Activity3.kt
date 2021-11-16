package com.example.assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        val Activity4Btn: Button = findViewById(R.id.Activity4Btn)

        Activity4Btn.setOnClickListener {
            val intent = Intent(this,Activity4::class.java)
            startActivity(intent)
        }
    }
}