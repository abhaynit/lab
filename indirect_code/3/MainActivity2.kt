package com.example.labproject3

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val extras = intent.extras
        val username = extras!!.getString("USERNAME")
        val regno = extras!!.getString("REG_NO")
        val email = extras!!.getString("EMAIL")
        val addr = extras!!.getString("ADDR")

        val name = findViewById<TextView>(R.id.name)
        val address = findViewById<TextView>(R.id.addr)
        val emai = findViewById<TextView>(R.id.email)
        val reg = findViewById<TextView>(R.id.reg)

        name.text = "NAME : $username"
        address.text = "ADDRESS : $addr"
        emai.text = "EMAIL : $email"
        reg.text = "REGNO : $regno"



    }
}