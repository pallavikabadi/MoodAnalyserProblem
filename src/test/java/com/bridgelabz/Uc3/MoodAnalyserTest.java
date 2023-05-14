package com.bridgelabz.Uc3;

import junit.framework.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class MoodAnalyserTest {
    //Refactored:
    @Test
    public void givenMessageWhenMoodSadReturnsSad() throws MoodAnalysisException {

        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String mood = moodAnalyser.moodAnalysis();
        Assertions.assertEquals("SAD",mood);
        System.out.println(mood);
    }
    @Test
    public void givenMessageWhenMoodHappyReturnsSad() throws MoodAnalysisException {

        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");
        String mood = moodAnalyser.moodAnalysis();
        Assertions.assertEquals("HAPPY",mood);
        System.out.println(mood);
    }
    //UC12:
    @Test
    public void givenMessageWhenNullReturnsHappy(){

        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            moodAnalyser.moodAnalysis();
        }
        catch (MoodAnalysisException e) {
            Assertions.assertEquals(MoodAnalysisException.ExceptionType.NULL,e.getType());
            System.out.println(e.getType());
        }
    }
    @Test
    public void givenMessageWhenEmptyReturnsHappy(){

        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        try {
            moodAnalyser.moodAnalysis();
        }
        catch (MoodAnalysisException e) {
            Assertions.assertEquals(MoodAnalysisException.ExceptionType.Empty,e.getType());
            System.out.println(e.getType());
        }
    }
}