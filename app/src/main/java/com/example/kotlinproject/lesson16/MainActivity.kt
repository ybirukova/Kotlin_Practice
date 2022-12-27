package com.example.kotlinproject.lesson16

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kotlinproject.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MyTag", "onCreate")
        val randomIntent = Intent (this, SecondActivity::class.java)
        randomIntent.putExtra("NUMBER", 2)
        startActivity(randomIntent)
    }

    override fun onStart() {
        super.onStart()
        Log.d("MyTag", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MyTag", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MyTag", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MyTag", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyTag", "onDestroy")
    }
}