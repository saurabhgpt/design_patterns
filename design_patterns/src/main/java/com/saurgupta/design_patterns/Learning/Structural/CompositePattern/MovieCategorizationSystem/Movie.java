package com.saurgupta.design_patterns.Learning.Structural.CompositePattern.MovieCategorizationSystem;

public class Movie implements IMovieSystem{
    String movieName;

    public Movie(String movieName) {
        this.movieName = movieName;
    }

    @Override
    public void ls() {
        System.out.println("Movie name - " + movieName);
    }
}
