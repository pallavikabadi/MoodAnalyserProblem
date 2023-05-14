package com.bridgelabz.Uc1;

public class MoodAnalyser {
    public String moodAnalysis(String message){
        if (message.contains("I am in sad Mood")) {
            return "SAD";
        }else
            return "HAPPY";
    }
}
