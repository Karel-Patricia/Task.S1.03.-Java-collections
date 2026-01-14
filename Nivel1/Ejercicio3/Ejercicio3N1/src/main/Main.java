package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String, String> cities = new HashMap<>();

        try {
            File textFile = new File("countries.txt");
            Scanner scReading = new Scanner(textFile);

            while (scReading.hasNextLine()) {
                String line = scReading.nextLine();
                String[] parts = line.split(" ");

                if (parts.length == 2) {
                    cities.put(parts[0].trim(), parts[1].trim());
                }
            }

            scReading.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error archivo no encontrado -> " + e.getMessage());
        }

        String userName = "";
        String userAnswer = "";

        System.out.println("Escribe tu nombre");
        userName = sc.nextLine();

        List<String> countryNames = new ArrayList<>(cities.keySet());
        Collections.shuffle(countryNames);

        int score = 0;

        for(int i = 0; i < 10 && i < countryNames.size(); i++){
            String country = countryNames.get(i);
            String correctCapital = cities.get(country);

            System.out.println("Capital de " + country +  ": ");
            userAnswer = sc.nextLine();

            if(userAnswer.equalsIgnoreCase(correctCapital)){
                score++;
            }
        }

        System.out.println();
        System.out.println("Juego terminado.");
        System.out.println("Tu puntuación es : " + score + "/10");

        



        }


}
