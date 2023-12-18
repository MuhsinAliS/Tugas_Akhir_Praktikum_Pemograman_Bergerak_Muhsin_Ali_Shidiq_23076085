package com.example.projectuas

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class sawit : AppCompatActivity() {
    private var button61: Button? = null
    private var button62: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sawit)
        button61 = findViewById<View>(R.id.button61) as Button
        button61!!.setOnClickListener { v: View? ->
            val intent1 = Intent(applicationContext, embungbendosari::class.java)
            startActivity(intent1)
        }
        button62 = findViewById<View>(R.id.button62) as Button
        button62!!.setOnClickListener { v: View? ->
            val intent1 = Intent(applicationContext, tamangajahputih::class.java)
            startActivity(intent1)
        }
    }
}