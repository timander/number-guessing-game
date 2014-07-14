package net.timandersen;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberPickerTest {

    @Test
    public void pickRandomNumberBetweenMinAndMax() {
        NumberPicker numberPicker = new NumberPicker(1, 10);
        System.out.println("numberPicker = " + numberPicker.getAnswer());
        assertTrue(numberPicker.getAnswer() <= 10);
        assertTrue(numberPicker.getAnswer() >= 1);
    }

    @Test
    public void guessTooHigh() {
        NumberPicker numberPicker = new NumberPicker(1,10);
        numberPicker.setAnswer(5);
        assertEquals("Nope, too high. Guess again.", numberPicker.guess(7));
    }

    @Test
    public void guessTooLow() {
        NumberPicker numberPicker = new NumberPicker(1,10);
        numberPicker.setAnswer(5);
        assertEquals("Nope, too low. Guess again.", numberPicker.guess(4));
    }

    @Test
    public void guessCorrect() {
        NumberPicker numberPicker = new NumberPicker(1,10);
        numberPicker.setAnswer(5);
        assertEquals("CORRECT!", numberPicker.guess(5));
    }


}
