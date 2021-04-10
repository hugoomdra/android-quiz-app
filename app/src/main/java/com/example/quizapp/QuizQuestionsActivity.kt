package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_quiz_questions.*

class QuizQuestionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        val questionList = Constants.getQuestions();

        val currentPosition = 1;
        val question: Question? = questionList[currentPosition - 1];

        progressBar.progress = currentPosition;
        progress_details_number.text = "$currentPosition" + "/" + progressBar.max

        question_id.text = question!!.question

        image_id.setImageResource(question.image)
        question_option_one.text = question.optionOne
        question_option_two.text = question.optionTwo
        question_option_three.text = question.optionThree
        question_option_four.text = question.optionFour

    }
}