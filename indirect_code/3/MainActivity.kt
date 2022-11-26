package com.example.labproject3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val name = findViewById<EditText>(R.id.name)
        val reg = findViewById<EditText>(R.id.reg)
        val addr = findViewById<EditText>(R.id.addr)
        val submit = findViewById<Button>(R.id.btn)
        val email = findViewById<EditText>(R.id.email)

        submit.setOnClickListener {
            var enteredName = name.text.toString()
            var enteredreg = reg.text.toString()
            var email1 = email.text.toString()
            var addr = addr.text.toString()
            if (enteredName=="")
            {
                //grettingTextView.text = ""
                Toast.makeText(
                    this@MainActivity,
                    "please enter your name",
                    Toast.LENGTH_SHORT
                ).show()
            }
            else if ((enteredreg=="" )|| (enteredreg.length < 10))
            {
                //grettingTextView.text = ""
                Toast.makeText(
                    this@MainActivity,
                    "please enter your registration no of 10 character",
                    Toast.LENGTH_SHORT
                ).show()
            }
            else
            {
                val intent = Intent(this, MainActivity2::class.java)
                val extras = Bundle()
                extras.putString("USERNAME", "$enteredName")
                extras.putString("REG_NO", "$enteredreg")
                extras.putString("EMAIL","$email1")
                extras.putString("ADDR","$addr")
                intent.putExtras(extras)
                startActivity(intent)
            }
        }


    }
}
