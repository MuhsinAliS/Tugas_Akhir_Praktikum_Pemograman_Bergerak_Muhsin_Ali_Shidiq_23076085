package com.example.projectuas;

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var login: Button? = null
    private var button2 : Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login = findViewById<View>(R.id.login) as Button
        login!!.setOnClickListener { v: View? ->
            val intent1 = Intent(applicationContext, MenuUtama::class.java)
            startActivity(intent1)
        }
        button2 = findViewById<View>(R.id.button2) as Button
        button2!!.setOnClickListener { v: View? ->
            val intent1 = Intent(applicationContext, daftar::class.java)
            startActivity(intent1)
        }
    }
}