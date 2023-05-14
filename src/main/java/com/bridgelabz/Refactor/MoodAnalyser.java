package com.bridgelabz.Refactor;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser(String message) {

        this.message = message;

    }
    public String moodAnalysis(){

        try {

            if (message.contains("I am in sad mood"))
                return "SAD";
            else if (message.contains("I am in happy mood"))
                return "SAD";

        } catch (NullPointerException e) {
            return "HAPPY";
        }
        return null;
    }
}
