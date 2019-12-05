package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SelectQuestionOptions : AppCompatActivity() {

    lateinit var createButton: Button
    lateinit var enterButton: Button
    lateinit var helpButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_question_options)

        createButton = findViewById(R.id.createQuestion)
        enterButton = findViewById(R.id.enterQuestion)
        helpButton= findViewById(R.id.requestHelp)

        createButton.setOnClickListener {
            val intent: Intent = Intent(applicationContext, QuestionView::class.java)
            val id = 1 // generate multiple values in future
            val view = 1 // if you enter you get the first view else you get second view
            intent.putExtra("id", 1)
            intent.putExtra("view", 1)
            intent.putExtra("questionView", view)
            if (id == 1) {

                startActivity(intent)
            }
        }

        enterButton.setOnClickListener{
            val intent: Intent = Intent(applicationContext, EnterQuizId::class.java)
            val id = 1
            intent.putExtra("id", 1)
            intent.putExtra("view", 2)

            if (id == 1) {

                 startActivity(intent)

            }
        }


    }
}
