package com.company;

import java.util.ArrayList;

public class Question {

    protected String question;
    protected ArrayList<String> options;
    protected String correctAnswer;

    public Question(String question, ArrayList<String> options, String correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public boolean isCorrect (String correctAnswer) {
        return true;
    }

    public void addOption (String option) {
        options.add(option);
    }

    public void displayPromptAndOptions() {

    }
}
