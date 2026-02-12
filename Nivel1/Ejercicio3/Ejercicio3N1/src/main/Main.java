package main;

import model.FileLoader;
import model.QuizGame;
import model.ScoreWriter;

import java.util.*;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        FileLoader loader = new FileLoader();
        QuizGame game = new QuizGame();
        ScoreWriter writer = new ScoreWriter();

        Map<String, String> cities = loader.loadCountries("countries.txt");

        System.out.println("Enter your name:");
        String userName = scanner.nextLine();

        int score = game.play(scanner, cities);

        System.out.println("\nGame finished.");
        System.out.println("Your score: " + score + "/10");

        writer.saveScore("classificacio.txt", userName, score);

        scanner.close();
    }

}
