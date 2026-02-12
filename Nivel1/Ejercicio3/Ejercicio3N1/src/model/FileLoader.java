package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileLoader {

    public Map<String, String> loadCountries(String fileName) {
        Map<String, String> cities = new HashMap<>();

        try {
            File file = new File(fileName);
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(" ");

                if (parts.length == 2) {
                    cities.put(parts[0].trim(), parts[1].trim());
                }
            }

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        return cities;
    }

}
