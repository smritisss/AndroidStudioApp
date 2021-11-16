package com.example.assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)
        val mainActivityBtn: Button = findViewById(R.id.mainActivityBtn)
        val exitBtn: Button = findViewById(R.id.exitBtn)
        mainActivityBtn.setOnClickListener(){
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        exitBtn.setOnClickListener(){
            this.finishAffinity();
        }
    }
}