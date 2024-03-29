package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class EnterQuizId : AppCompatActivity(){

    lateinit var quizId: EditText
    lateinit var idError: TextView
    lateinit var enterQuiz: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter_quiz_id)

        quizId = findViewById(R.id.editQuizId)
        enterQuiz = findViewById(R.id.startQuizScreen)
        idError = findViewById(R.id.idError)

        enterQuiz.setOnClickListener {
            if (!quizId.text.isNullOrEmpty()) {
                val intent: Intent = Intent(applicationContext, QuestionView::class.java)
                //val idVal: Int = quizId // send it to value as string.
                val id = 1
                intent.putExtra("idVal", id)
                intent.putExtra("view",2)
                startActivity(intent)
            }else
                idError.text = "Need a ID to continue"

        }

    }



}
