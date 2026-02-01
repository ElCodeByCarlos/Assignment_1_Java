package sheridan.carlos.assignment_1_carlos_tello_dominguez;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Blocks implements Serializable {

    private final Random random = new Random();
    private final List<Character> letters;

    public Blocks() {
        this.letters = new ArrayList<>(32);
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            this.letters.add(letter);
        }
    }

    public synchronized List<Character> getLetters() {
        return List.copyOf(letters);
    }


    public boolean isMoreThanTen(String userInput)
    {
        return userInput != null && userInput.trim().length() >= 10;
    }
    public synchronized List<Character> userLettersInput(String userInput)
    {
        if(userInput == null)
        {
            return List.of();
        }

        userInput = userInput.trim().toUpperCase();

        return userInput.chars().filter(c -> c >= 'A' && c <= 'Z')
                .mapToObj(c -> (char) c)
                .toList();
    }

    @Override
    public String toString() {
        return "Blocks{" +
                "letters=" + letters +
                '}';
    }

}
