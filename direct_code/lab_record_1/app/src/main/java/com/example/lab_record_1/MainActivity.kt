package com.example.lab_record_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name = findViewById<EditText>(R.id.name)
        val reg = findViewById<EditText>(R.id.reg)
        val submit = findViewById<Button>(R.id.submit)


        submit.setOnClickListener {
            var enteredName = name.text.toString()
            var enteredreg = reg.text.toString()
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
            else{
                Toast.makeText(
                    this@MainActivity,
                    "Thank you " + enteredName + " registered successfully",
                    Toast.LENGTH_SHORT

                ).show()
                val intent = Intent(this,MainActivity2::class.java)
                intent.putExtra("USER",enteredName)
                startActivity(intent)
            }

        }
    }
}