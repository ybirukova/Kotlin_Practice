package com.example.kotlinproject.lesson16.homework

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.kotlinproject.R

class SecondActivity1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)

        val someText = intent.getStringExtra("SOME_TEXT")

        val textView = findViewById<TextView>(R.id.textView1)
        textView.text = someText
    }
}