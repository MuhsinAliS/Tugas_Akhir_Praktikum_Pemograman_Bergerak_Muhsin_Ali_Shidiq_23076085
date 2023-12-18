package com.example.projectuas

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ampel : AppCompatActivity() {
    private var button23: Button? = null
    private var button24: Button? = null
    private var button25: Button? = null
    private var button26: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ampel)
        button23 = findViewById<View>(R.id.button23) as Button
        button23!!.setOnClickListener { v: View? ->
            val intent1 = Intent(applicationContext, airterjunsemuncar::class.java)
            startActivity(intent1)
        }
        button24 = findViewById<View>(R.id.button24) as Button
        button24!!.setOnClickListener { v: View? ->
            val intent1 = Intent(applicationContext, pancuranmongkrong::class.java)
            startActivity(intent1)
        }
        button25 = findViewById<View>(R.id.button25) as Button
        button25!!.setOnClickListener { v: View? ->
            val intent1 = Intent(applicationContext, tamanmekar::class.java)
            startActivity(intent1)
        }
        button26 = findViewById<View>(R.id.button26) as Button
        button26!!.setOnClickListener { v: View? ->
            val intent1 = Intent(applicationContext, puncaktriangulasi::class.java)
            startActivity(intent1)
        }
    }
}
