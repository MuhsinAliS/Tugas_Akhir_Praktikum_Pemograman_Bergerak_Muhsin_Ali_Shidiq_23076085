package com.example.projectuas

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class boyolali : AppCompatActivity() {
    private var button33: Button? = null
    private var button34: Button? = null
    private var button35: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.boyolali)
        button33 = findViewById<View>(R.id.button33) as Button
        button33!!.setOnClickListener { v: View? ->
            val intent1 = Intent(applicationContext, simpanglima::class.java)
            startActivity(intent1)
        }
        button34 = findViewById<View>(R.id.button34) as Button
        button34!!.setOnClickListener { v: View? ->
            val intent1 = Intent(applicationContext, alunalunkidul::class.java)
            startActivity(intent1)
        }
        button35 = findViewById<View>(R.id.button35) as Button
        button35!!.setOnClickListener { v: View? ->
            val intent1 = Intent(applicationContext, balaitamannasional::class.java)
            startActivity(intent1)
        }
    }
}