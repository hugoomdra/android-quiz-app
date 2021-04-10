package com.example.quizapp

object Constants{

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>();

        val que1 = Question(
            1,
            "A quel pays appartient ce drapeau ?",
            R.drawable.ic_flag_of_argentina,
            "Argentine",
            "Angleterre",
            "Inde",
            "France",
            1
        )

        questionsList.add(que1);
        return questionsList;
    }




}