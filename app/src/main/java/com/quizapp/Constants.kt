package com.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "Select a feature that does not represent data binding",
            R.drawable.ic_data_binding,
            "The support is added in the existing files", "Represents a join between layout and fragments.",
            "findViewById(R.id.name_text) is not necessary any longer, which causes a faster development", 1
        )

        questionsList.add(que1)

        val que2 = Question(
            2, "If I had to evaluate different cases, which statement would be the best?",
            R.drawable.ic_bundle,
            "when (option) { 1 -> func1( )   2 -> func2( )  ... }", "switch(expression) { case value1: func1 break; case value2: func2 break; }\n",
            "if(condition) func1; if(condition) func2;", 1
        )

        questionsList.add(que2)

        val que3 = Question(
            3, "How could you possibly use bundle along the code?",
            R.drawable.ic_when_switch,
            "Transport a list of values through activities", "Enable navigation between fragments",
            "Include certain design packages in the app",1
        )

        questionsList.add(que3)
        return questionsList
    }
}