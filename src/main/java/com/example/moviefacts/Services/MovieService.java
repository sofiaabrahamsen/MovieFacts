package com.example.moviefacts.Services;

import com.example.moviefacts.models.Movie;
import com.example.moviefacts.repositories.FileReader;

import java.util.ArrayList;
import java.util.Random;

public class MovieService {
    private FileReader reader = new FileReader();
    private ArrayList<Movie> allMovies;

    public MovieService (){
        allMovies = reader.readFile();
    }

    public String getFirst(){
        return allMovies.get(0).getTitle();
    }

}
