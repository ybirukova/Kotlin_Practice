package com.example.kotlinproject.lesson16

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.kotlinproject.R

class SecondActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val count = intent.getIntExtra("NUMBER", 2)

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = "Число с прошлого экрана " + count
    }
}