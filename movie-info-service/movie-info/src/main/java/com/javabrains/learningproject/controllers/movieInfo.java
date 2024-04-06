package com.javabrains.learningproject.controllers;

import com.javabrains.learningproject.entities.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController

@RequestMapping("/movies")
public class movieInfo {

    @RequestMapping("/{movieID}")
    public List<Movie> getAllMovie(@PathVariable String movieID){

           return Arrays.asList(new Movie("2","ABC"));

    }
}
