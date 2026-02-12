package model;

import java.util.*;

public class QuizGame {

    public int play(Scanner scanner, Map<String, String> cities) {

        List<String> countryNames = new ArrayList<>(cities.keySet());
        Collections.shuffle(countryNames);

        int score = 0;

        for (int i = 0; i < 10 && i < countryNames.size(); i++) {

            String country = countryNames.get(i);
            String correctCapital = cities.get(country);

            System.out.println("Capital of " + country + ":");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(correctCapital)) {
                score++;
            }
        }

        return score;
    }
}
