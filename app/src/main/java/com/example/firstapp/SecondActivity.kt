package com.example.firstapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class SecondActivity : AppCompatActivity() {


    lateinit var secondTextOutput: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        secondTextOutput = findViewById(R.id.secondText)

        val name: String = intent.getStringExtra("nameVal") //important that types matches!

        secondTextOutput.text = "Output is taken from previous page input: $name"



    }
}
