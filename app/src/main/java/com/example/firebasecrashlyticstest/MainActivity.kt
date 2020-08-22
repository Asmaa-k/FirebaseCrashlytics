package com.example.firebasecrashlyticstest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //crush button
        crashButton.setOnClickListener {
            throw RuntimeException("Test Crash") // Force a crash
        }
    }
}