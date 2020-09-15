package com.company;

import java.util.ArrayList;

public class Checkbox extends Question{

    private int correctAnswer;
    private ArrayList<String> possibleAnswers;


    public boolean isCorrect(String answer) {
        return true;
    }

    public Checkbox(String question, ArrayList<String> options, String correctAnswer, int correctAnswer1, ArrayList<String> possibleAnswers) {
        super(question, options, correctAnswer);
        this.correctAnswer = correctAnswer1;
        this.possibleAnswers = possibleAnswers;
    }
}
