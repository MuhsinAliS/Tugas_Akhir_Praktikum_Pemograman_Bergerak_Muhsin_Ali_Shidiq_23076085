package com.example.projectuas

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class selo : AppCompatActivity() {
    private var button63: Button? = null
    private var button64: Button? = null
    private var button65: Button? = null
    private var button66: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.selo)
        button63 = findViewById<View>(R.id.button63) as Button
        button63!!.setOnClickListener { v: View? ->
            val intent1 = Intent(applicationContext, newselo::class.java)
            startActivity(intent1)
        }
        button64 = findViewById<View>(R.id.button64) as Button
        button64!!.setOnClickListener { v: View? ->
            val intent1 = Intent(applicationContext, merapigarden::class.java)
            startActivity(intent1)
        }
        button65 = findViewById<View>(R.id.button65) as Button
        button65!!.setOnClickListener { v: View? ->
            val intent1 = Intent(applicationContext, bukitgancik::class.java)
            startActivity(intent1)
        }
        button66 = findViewById<View>(R.id.button66) as Button
        button66!!.setOnClickListener { v: View? ->
            val intent1 = Intent(applicationContext, embungmanajar::class.java)
            startActivity(intent1)
        }
    }
}