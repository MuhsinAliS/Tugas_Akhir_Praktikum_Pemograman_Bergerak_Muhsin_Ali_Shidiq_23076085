package com.example.projectuas

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class andong : AppCompatActivity() {
    private var button27: Button? = null
    private var button28: Button? = null
    private var button29: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.andong)
        button27 = findViewById<View>(R.id.button27) as Button
        button27!!.setOnClickListener { v: View? ->
            val intent1 = Intent(applicationContext, umbultirah::class.java)
            startActivity(intent1)
        }
        button28 = findViewById<View>(R.id.button28) as Button
        button28!!.setOnClickListener { v: View? ->
            val intent1 = Intent(applicationContext, telagaterate::class.java)
            startActivity(intent1)
        }
        button29 = findViewById<View>(R.id.button29) as Button
        button29!!.setOnClickListener { v: View? ->
            val intent1 = Intent(applicationContext, waterboom::class.java)
            startActivity(intent1)
        }
    }
}