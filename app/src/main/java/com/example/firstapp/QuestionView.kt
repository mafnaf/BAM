package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import kotlinx.android.synthetic.main.activity_question_view.*

class QuestionView : AppCompatActivity() {

    lateinit var questionType: TextView // questionTypeName
    lateinit var logicKeyElement1: TextView //logicKey1
    lateinit var logicKeyElement2: TextView //logicKey2

    lateinit var logicElement1: TextView//logicElement1
    lateinit var logicElement2: TextView//logicElement2
    lateinit var logicElement3: TextView//logicElement3
    lateinit var logicElement4: TextView//logicElement4
    lateinit var logicElement5: TextView//logicElement5
    //lateinit var logicElement6: TextView//logicElement6
    lateinit var logicElement7: TextView//logicElement7 // key to logic
    lateinit var logicElement8: TextView//logicElement8 // key to logic
    lateinit var questionText: TextView // mainTextBody

    lateinit var answerTextView1: Button//answerElement1
    lateinit var answerTextView2: Button//answerElement2
    lateinit var answerTextView3: Button//answerElement3
    lateinit var answerTextView4: Button//answerElement4

    private val correct = 2 // hardcoded in this case

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_view)

        questionType = findViewById(R.id.questionTypeName)
        logicKeyElement1 = findViewById(R.id.logicKey1)
        logicKeyElement2 = findViewById(R.id.logicKey2)
        logicElement1 = findViewById(R.id.logicElement1)
        logicElement2 = findViewById(R.id.logicElement2)
        logicElement3 = findViewById(R.id.logicElement3)
        logicElement4 = findViewById(R.id.logicElement4)
        logicElement5 = findViewById(R.id.logicElement5)
        //logicElement6 = findViewById(R.id.logicElement5)
        logicElement7 = findViewById(R.id.logicElement7)
        logicElement8 = findViewById(R.id.logicElement8)

        questionText = findViewById(R.id.mainTextBody)
        answerTextView1 = findViewById(R.id.answerElement1)
        answerTextView2 = findViewById(R.id.answerElement2)
        answerTextView3 = findViewById(R.id.answerElement3)
        answerTextView4 = findViewById(R.id.answerElement4)


        val view: Int = intent.getIntExtra("view", 1)
        val id: Int = intent.getIntExtra("id", 1)
        if (id ==1) {
            questionTypeName.text = "Sequence player $view"// id 1 sequence
        }else if (id == 2){
            questionTypeName.text = "Logic player $view" // id 2 Logic
        }
        logicElement1.text = "1"
        logicElement2.text = "2"
        logicElement3.text = "3"
        logicElement4.text = "4"
        logicElement5.text = "5"
        if (view == 1) {
            logicElement7.text = "2"
            logicElement8.text = "1"
            logicKey1.text = "1"
            logicKey2.text = "6"
        }else {
            logicElement7.text = "4"
            logicElement8.text = "3"
            logicKey1.text = "7"
            logicKey2.text = "13"
        }

        mainTextBody.text = "Find the 5:th value in the sequence"
        answerElement1.text = "17"
        answerElement2.text = "20"
        answerElement3.text = "21"
        answerElement4.text = "14"

        answerTextView1.setOnClickListener{
            if (correct == 1)
                answerElement1.setBackgroundColor(getResources().getColor(R.color.Correct))
            else
                answerElement1.setBackgroundColor(getResources().getColor(R.color.Wrong))
        }

        answerTextView2.setOnClickListener{
            if (correct == 2)
                answerElement2.setBackgroundColor(getResources().getColor(R.color.Correct))
            else
                answerElement2.setBackgroundColor(getResources().getColor(R.color.Wrong))
        }

        answerTextView3.setOnClickListener{
            if (correct == 3)
                answerElement3.setBackgroundColor(getResources().getColor(R.color.Correct))
            else
                answerElement3.setBackgroundColor(getResources().getColor(R.color.Wrong))
        }
        answerTextView4.setOnClickListener{
            if (correct == 4)
                answerElement4.setBackgroundColor(getResources().getColor(R.color.Correct))
            else
                answerElement4.setBackgroundColor(getResources().getColor(R.color.Wrong))
        }



    }


}
