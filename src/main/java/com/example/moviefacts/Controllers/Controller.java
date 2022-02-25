package com.example.moviefacts.Controllers;

import com.example.moviefacts.Services.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
    private MovieService service = new MovieService();

    //Opgave 3.1
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to Movie Facts! This application can provide you information about movies";
    }

    //Opgave 3.2
    @GetMapping("getFirst")
    public String endpoint(){
        return service.getFirst();
    }

    //opgave 3.3
}
