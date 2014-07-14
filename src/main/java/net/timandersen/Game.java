package net.timandersen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {

    public static void main(String[] args) {
        NumberPicker numberPicker = new NumberPicker(1, 10);

        System.out.print("Guess a number between 1 and 10: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String guess = null;
        try {
            guess = br.readLine();
            String message = numberPicker.guess(new Integer(guess));
            System.out.println(message);
        } catch (IOException ioe) {
            System.out.println(guess + "is an invalid guess");
        }
    }
}
