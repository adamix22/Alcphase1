package com.adams.alcphase1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        aboutalc.setOnClickListener {
            startActivity(Intent(this,AboutAlc::class.java))
        }
        myprofile.setOnClickListener {
            startActivity(Intent(this,MyProfile::class.java))
        }

    }
}
