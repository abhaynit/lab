package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var value = findViewById<TextView>(R.id.textView2)
        var btn1 = findViewById<Button>(R.id.btn1)
        var btn2 = findViewById<Button>(R.id.btn2)
        var btn3 = findViewById<Button>(R.id.btn3)
        var btn4 = findViewById<Button>(R.id.btn4)
        var btn5 = findViewById<Button>(R.id.btn5)
        var btn6 = findViewById<Button>(R.id.btn6)
        var btn7 = findViewById<Button>(R.id.btn7)
        var btn8 = findViewById<Button>(R.id.btn8)
        var btn9 = findViewById<Button>(R.id.btn9)
        var btn0 = findViewById<Button>(R.id.btn0)

        var btnp = findViewById<Button>(R.id.btnp)
        var btns = findViewById<Button>(R.id.btns)
        var btnm = findViewById<Button>(R.id.btnm)
        var btnd = findViewById<Button>(R.id.btnd)
        var btne = findViewById<Button>(R.id.btne)
        var btnr = findViewById<Button>(R.id.btnr)

        var initial_value = ""
        var mo = ""

        btn1.setOnClickListener {
           var valu = value.text.toString()
           value.text = valu+"1"
        }

        btn2.setOnClickListener {
            var valu = value.text.toString()
            value.text = valu+"2"
        }

        btn3.setOnClickListener {
            var valu = value.text.toString()
            value.text = valu+"3"
        }

        btn4.setOnClickListener {
            var valu = value.text.toString()
            value.text = valu+"4"
        }

        btn5.setOnClickListener {
            var valu = value.text.toString()
            value.text = valu+"5"
        }

        btn6.setOnClickListener {
            var valu = value.text.toString()
            value.text = valu+"6"
        }

        btn7.setOnClickListener {
            var valu = value.text.toString()
            value.text = valu+"7"
        }

        btn8.setOnClickListener {
            var valu = value.text.toString()
            value.text = valu+"8"
        }

        btn9.setOnClickListener {
            var valu = value.text.toString()
            value.text = valu+"9"
        }

        btn0.setOnClickListener {
            var valu = value.text.toString()
            value.text = valu+"0"
        }

        btnp.setOnClickListener {
            var valu = value.text.toString()
            initial_value = valu
            mo = "+"
            value.text = ""
        }

        btns.setOnClickListener {
            var valu = value.text.toString()
            initial_value = valu
            mo = "-"
            value.text = ""
        }

        btnm.setOnClickListener {
            var valu = value.text.toString()
            initial_value = valu
            mo = "*"
            value.text = ""
        }

        btnd.setOnClickListener {
            var valu = value.text.toString()
            initial_value = valu
            mo = "/"
            value.text = ""
        }

        btne.setOnClickListener {
            var valu = value.text.toString()
            if (mo == "+") {
                var fin =  initial_value.toInt()+valu.toInt()
                value.text = "$fin"
            }
            else if (mo =="-")
            {
                var fin = initial_value.toInt()-valu.toInt()
                value.text = "$fin"
            }
            else if (mo == "*")
            {
                var fin = initial_value.toInt()*valu.toInt()
                value.text = "$fin"
            }
            else if (mo == "/")
            {
                var fin = initial_value.toInt()/valu.toInt()
                value.text = "$fin"
            }
        }

        btnr.setOnClickListener {
            initial_value = ""
            mo = ""
            value.text = ""
        }











    }



}