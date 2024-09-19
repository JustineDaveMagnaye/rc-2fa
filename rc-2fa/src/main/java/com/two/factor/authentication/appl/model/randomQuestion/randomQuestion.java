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

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public String getQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer;
    }
}
