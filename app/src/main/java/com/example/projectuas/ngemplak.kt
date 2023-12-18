package com.example.projectuas

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ngemplak : AppCompatActivity() {
    private var button55: Button? = null
    private var button56: Button? = null
    private var button57: Button? = null
    private var button58: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ngemplak)
        button55 = findViewById<View>(R.id.button55) as Button
        button55!!.setOnClickListener { v: View? ->
            val intent1 = Intent(applicationContext, asramahaji::class.java)
            startActivity(intent1)
        }
        button56 = findViewById<View>(R.id.button56) as Button
        button56!!.setOnClickListener { v: View? ->
            val intent1 = Intent(applicationContext, wadukcengklik::class.java)
            startActivity(intent1)
        }
        button57 = findViewById<View>(R.id.button57) as Button
        button57!!.setOnClickListener { v: View? ->
            val intent1 = Intent(applicationContext, wadukcengklikpark::class.java)
            startActivity(intent1)
        }
        button58 = findViewById<View>(R.id.button58) as Button
        button58!!.setOnClickListener { v: View? ->
            val intent1 = Intent(applicationContext, sindonpark::class.java)
            startActivity(intent1)
        }
    }
}