package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

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

        System.out.println(cities);



        }


}
