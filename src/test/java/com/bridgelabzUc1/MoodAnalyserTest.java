package com.bridgelabzUc1;

import com.bridgelabz.Uc1.MoodAnalyser;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MoodAnalyserTest {
    @Test
    public void givenMessageWhenSadReturnsSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.moodAnalysis("I am in sad Mood");
        Assertions.assertEquals("SAD",mood);
        System.out.println(mood);
    }
    @Test
    public void givenMessageWhenHappyReturnsHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.moodAnalysis("I am healthy");
        Assertions.assertEquals("HAPPY",mood);
        System.out.println(mood);
    }

}
