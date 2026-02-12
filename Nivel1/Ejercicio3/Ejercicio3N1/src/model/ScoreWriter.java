package model;

import java.io.FileWriter;
import java.io.IOException;

public class ScoreWriter {

    public void saveScore(String fileName, String userName, int score) {

        try {
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(userName + " - " + score + "\n");
            writer.close();

        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }
    }
}
