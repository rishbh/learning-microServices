package com.javabrains.learningproject.controller;


import com.javabrains.learningproject.entities.Movie;
import com.javabrains.learningproject.entities.catalogItem;
import com.javabrains.learningproject.entities.movieRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class moviecatalog {


    @Autowired

    private  RestTemplate restTemplate;
    @RequestMapping("/{userId}")
    public List<catalogItem> getCatalog(@PathVariable  String userId) {

      //  Movie mobj1=restTemplate.getForObject("http://localhost:8081/movies/4", Movie.class);


        // get all the movieIDs watched by the user

        // get all the movie information of all the movieIDs watched

        //return the combined result

        List<movieRating>ratings= Arrays.asList(new movieRating("123",4),
                                                new movieRating("456",5),
        new movieRating("486",5));

        return ratings.stream().map(rating->{
            System.out.println(" unmarshalling strss  ");
            Movie mobj=restTemplate.getForObject("http://localhost:8081/movies/"+""+rating.getMovieID(), Movie.class);
            System.out.println(" unmarshalling done  ");
                return new catalogItem(mobj.getMovieName()," movie is enogh good  ",rating.getRating());
        }).collect(
                Collectors.toList()
        );





    }

}
