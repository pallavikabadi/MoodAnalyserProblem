package com.bridgelabz.Refactor;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MoodAnalyserTest {
    //Refactored:
    @Test
    public void givenMessageWhenMoodSadReturnsSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String mood = moodAnalyser.moodAnalysis();
        Assertions.assertEquals("SAD",mood);
        System.out.println(mood);
    }
    @Test
    public void givenMessageWhenMoodHappyReturnsSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");
        String mood = moodAnalyser.moodAnalysis();
        Assertions.assertEquals("SAD",mood);
        System.out.println(mood);
    }
    @Test
    public void givenMessageWhenNullReturnsHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(" ");
        String mood = moodAnalyser.moodAnalysis();
        Assertions.assertEquals("HAPPY",mood);
        System.out.println(mood);
    }

}
