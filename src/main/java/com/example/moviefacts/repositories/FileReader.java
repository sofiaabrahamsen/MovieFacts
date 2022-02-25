package com.example.moviefacts.repositories;

import com.example.moviefacts.models.Movie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    public ArrayList<Movie> readFile() {
        File movieFile = new File("Ressources/movies.csv");
        ArrayList<Movie> allMovies = new ArrayList<>();

        try {
            Scanner sc = new Scanner(movieFile);
            while (sc.hasNext()) {
                String line = sc.nextLine();
                String[] stringAsArray = line.split(";");

                try {
                    int year = Integer.parseInt(stringAsArray[0]);
                    int lenght = Integer.parseInt(stringAsArray[1]);
                    String title = stringAsArray[2];
                    String subject = stringAsArray[3];
                    int popularity = Integer.parseInt(stringAsArray[4]);
                    String awards = stringAsArray[5];

                    Movie currentMovies = new Movie(year, lenght, title, subject, popularity, awards);
                    allMovies.add(currentMovies);
                } catch (NumberFormatException n) {
                    System.out.println("This String could not be converted to an Interger");
                    n.printStackTrace();
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("This file can not be found");
            e.printStackTrace();
        }

        System.out.println("Alle film i databasen: " + allMovies.size());
        System.out.println("Titel på film nr. 1 i listen: " + allMovies.get(0).getTitle());
        return allMovies;
    }

}
