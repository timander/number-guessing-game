package net.timandersen;

import java.util.Random;

public class NumberPicker {

    private int answer;

    public NumberPicker(int min, int max) {
        Random random = new Random();
        answer = random.nextInt(max - min) + min;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public String guess(int guessedNumber) {
        if (answer == guessedNumber) {
            return "CORRECT!";
        }
        if (answer < guessedNumber) {
            return "Nope, too high. Guess again.";
        }

        return "Nope, too low. Guess again.";
    }
}
