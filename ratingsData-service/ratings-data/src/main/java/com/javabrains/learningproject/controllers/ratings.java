package com.javabrains.learningproject.controllers;


import com.javabrains.learningproject.entities.movieRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class ratings {


       @RequestMapping("/{movieID}")
       public List<movieRating> getRating(@PathVariable int movieID){

              return Arrays.asList((new movieRating(4,5)),
                      (new movieRating(5,6)));
       }
}
