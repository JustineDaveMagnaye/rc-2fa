package com.two.factor.authentication.appl.model.randomQuestion;

import java.sql.Timestamp;

/**
 * Employee model class representing employee information.
 */
public class randomQuestion {
    private String questionType;
    private String questionAnswer;

    /**
     * Default constructor for Employee.
     */

    public randomQuestion(){
    }

    public randomQuestion(String questionType, String questionAnswer) {
        this.questionType = questionType;
        this.questionAnswer = questionAnswer;
    }

    public String getQuestionType() {
        return questionType;
    }

    public String getQuestionAnswer() {
        return questionAnswer;
    }
}
