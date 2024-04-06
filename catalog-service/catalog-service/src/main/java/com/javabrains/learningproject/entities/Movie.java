package com.javabrains.learningproject.entities;



public class Movie {

     String  movieId;

     public Movie() {
     }

     String movieName;

     public String getMovieId() {
          return movieId;
     }

     public void setMovieId(String movieId) {
          this.movieId = movieId;
     }

     public String getMovieName() {
          return movieName;
     }

     public void setMovieName(String movieName) {
          this.movieName = movieName;
     }

     public Movie(String movieId, String movieName) {
          this.movieId = movieId;
          this.movieName = movieName;
     }
}
