package com.bridgelabz.Uc3;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }
    public String moodAnalysis()throws MoodAnalysisException{

        try {
            if (message.length() == 0)
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.Empty, "Invalid Message");

            else if (message.contains("I am in sad mood"))
                return "SAD";
            else
                return "HAPPY";

        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NULL, "Invalid Message");
        }
    }
}