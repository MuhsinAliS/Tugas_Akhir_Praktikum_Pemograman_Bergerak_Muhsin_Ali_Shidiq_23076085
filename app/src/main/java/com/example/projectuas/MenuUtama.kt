package com.example.projectuas

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MenuUtama : AppCompatActivity() {
    private var button1: Button? = null
    private var button2: Button? = null
    private var button3: Button? = null
    private var button4: Button? = null
    private var button5: Button? = null
    private var button6: Button? = null
    private var button7: Button? = null
    private var button8: Button? = null
    private var button9: Button? = null
    private var button10: Button? = null
    private var button11: Button? = null
    private var button12: Button? = null
    private var button13: Button? = null
    private var button14: Button? = null
    private var button15: Button? = null
    private var button16: Button? = null
    private var button17: Button? = null
    private var button18: Button? = null
    private var button19: Button? = null
    private var button20: Button? = null
    private var button21: Button? = null
    private var button22: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_utama)
        button1 = findViewById<View>(R.id.button1) as Button
        button1!!.setOnClickListener { v: View? ->
            val intent1 = Intent(applicationContext, ampel::class.java)
            startActivity(intent1)
        }
        button2 = findViewById<View>(R.id.button2) as Button
        button2!!.setOnClickListener { v: View? ->
            val intent2 = Intent(applicationContext, andong::class.java)
            startActivity(intent2)
        }
        button3 = findViewById<View>(R.id.button3) as Button
        button3!!.setOnClickListener { v: View? ->
            val intent2 = Intent(applicationContext, banyudono::class.java)
            startActivity(intent2)
        }
        button4 = findViewById<View>(R.id.button4) as Button
        button4!!.setOnClickListener { v: View? ->
            val intent2 = Intent(applicationContext, boyolali::class.java)
            startActivity(intent2)
        }
        button5 = findViewById<View>(R.id.button5) as Button
        button5!!.setOnClickListener { v: View? ->
            val intent2 = Intent(applicationContext, cepogo::class.java)
            startActivity(intent2)
        }
        button6 = findViewById<View>(R.id.button6) as Button
        button6!!.setOnClickListener { v: View? ->
            val intent2 = Intent(applicationContext, gladagsari::class.java)
            startActivity(intent2)
        }
        button7 = findViewById<View>(R.id.button7) as Button
        button7!!.setOnClickListener { v: View? ->
            val intent2 = Intent(applicationContext, juwangi::class.java)
            startActivity(intent2)
        }
        button8 = findViewById<View>(R.id.button8) as Button
        button8!!.setOnClickListener { v: View? ->
            val intent2 = Intent(applicationContext, karanggede::class.java)
            startActivity(intent2)
        }
        button9 = findViewById<View>(R.id.button9) as Button
        button9 !!.setOnClickListener { v: View? ->
            val intent2 = Intent(applicationContext, kemusu::class.java)
            startActivity(intent2)
        }
        button10 = findViewById<View>(R.id.button10) as Button
        button10 !!.setOnClickListener { v: View? ->
            val intent2 = Intent(applicationContext, mojosongo::class.java)
            startActivity(intent2)
        }
        button11 = findViewById<View>(R.id.button11) as Button
        button11 !!.setOnClickListener { v: View? ->
            val intent2 = Intent(applicationContext, klego::class.java)
            startActivity(intent2)
        }
        button12 = findViewById<View>(R.id.button12) as Button
        button12 !!.setOnClickListener { v: View? ->
            val intent2 = Intent(applicationContext, musuk::class.java)
            startActivity(intent2)
        }
        button13 = findViewById<View>(R.id.button13) as Button
        button13 !!.setOnClickListener { v: View? ->
            val intent2 = Intent(applicationContext, ngemplak::class.java)
            startActivity(intent2)
        }
        button15 = findViewById<View>(R.id.button15) as Button
        button15 !!.setOnClickListener { v: View? ->
            val intent2 = Intent(applicationContext, sambi::class.java)
            startActivity(intent2)
        }
        button16 = findViewById<View>(R.id.button16) as Button
        button16 !!.setOnClickListener { v: View? ->
            val intent2 = Intent(applicationContext, sawit::class.java)
            startActivity(intent2)
        }
        button17 = findViewById<View>(R.id.button17) as Button
        button17 !!.setOnClickListener { v: View? ->
            val intent2 = Intent(applicationContext, selo::class.java)
            startActivity(intent2)
        }
        button18 = findViewById<View>(R.id.button18) as Button
        button18 !!.setOnClickListener { v: View? ->
            val intent2 = Intent(applicationContext, simo::class.java)
            startActivity(intent2)
        }
        button20 = findViewById<View>(R.id.button20) as Button
        button20 !!.setOnClickListener { v: View? ->
            val intent2 = Intent(applicationContext, teras::class.java)
            startActivity(intent2)
        }
    }
}