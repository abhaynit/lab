package com.example.lab_record_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val username = intent.getStringExtra("USER")
        val textview = findViewById<TextView>(R.id.output)
        val message = "Welcome ,$username, registration completed"
        textview.text = message
    }
}