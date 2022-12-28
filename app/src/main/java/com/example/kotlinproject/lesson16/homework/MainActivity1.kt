package com.example.kotlinproject.lesson16.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kotlinproject.R

class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    override fun onStop() {
        super.onStop()
        Log.d("MyTag", "onStop")

        val someIntent = Intent(this, SecondActivity1::class.java)
        someIntent.putExtra("SOME_TEXT", "Have a nice day")
        startActivity(someIntent)
    }
}