package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class EnterQuizId : AppCompatActivity(){

    lateinit var editQuizId: EditText
    lateinit var swapScreen: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editQuizId = findViewById(R.id.editQuizId)
        swapScreen = findViewById(R.id.swapScreen)


        swapScreen.setOnClickListener {
            val intent: Intent = Intent(applicationContext, SelectQuestionOptions::class.java)
            val idVal: String? = editQuizId.text.toString() // send it to value as string.
            intent.putExtra("idVal", idVal)
            startActivity(intent)

        }

    }



}
