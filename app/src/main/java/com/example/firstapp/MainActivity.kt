package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(){
    lateinit var loginName: EditText
    lateinit var passwordText: EditText
    lateinit var loginButton: Button
    lateinit var buttonUpdateNew: Button
    lateinit var buttonSwapScreen: Button
    lateinit var textViewMessage: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginName = findViewById(R.id.editTextName)
        loginButton = findViewById(R.id.buttonLogin)
        buttonUpdateNew = findViewById(R.id.buttonUpdateNameNew)
        textViewMessage = findViewById(R.id.textViewName)
        buttonSwapScreen = findViewById(R.id.swapScreen)
        passwordText = findViewById(R.id.passwordLogin)

        buttonUpdateNew.setOnClickListener{
                val name = loginName.text
                textViewMessage.text = "The selected name: $name, welcome to the new button"
            }

        loginButton.setOnClickListener{
            val name = loginName.text
            val password = passwordText.text
            if (name.isNullOrEmpty() || password.isNullOrEmpty())
                textViewMessage.text = "Needs password and username"
            else
                textViewMessage.text = "The selected name: $name"

        }

        buttonSwapScreen.setOnClickListener{
            val intent: Intent = Intent(applicationContext, com.example.firstapp.SelectQuestionOptions::class.java)
            val nameVal: String? = loginName.text.toString() // send it to value as string.
            intent.putExtra("nameVal", nameVal)
            startActivity(intent)
        }
    }



}
