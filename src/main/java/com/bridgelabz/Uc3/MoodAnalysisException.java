package com.bridgelabz.Uc3;

public class MoodAnalysisException extends Exception {
    ExceptionType type;
    public ExceptionType getType(){
        return type;

    }
    enum ExceptionType {
        NULL , Empty
    }
    public MoodAnalysisException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
