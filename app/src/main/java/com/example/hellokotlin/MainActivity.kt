package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var message: String = findViewById<TextView>(R.id.textView).text.toString()
        log.i(tag:"message textview", message)
    }
}