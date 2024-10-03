package com.saurgupta.design_patterns.Learning.Structural.CompositePattern.MovieCategorizationSystem;

import java.util.ArrayList;
import java.util.List;

public class MovieCategory implements IMovieSystem{
    List<IMovieSystem> movieSystemList;
    String movieCategoryName;

    public MovieCategory(String movieCategoryName) {
        this.movieSystemList = new ArrayList<>();;
        this.movieCategoryName = movieCategoryName;
    }

    public void add(IMovieSystem movieSystem) {
        movieSystemList.add(movieSystem);
    }

    @Override
    public void ls() {
        System.out.println("Movie category name - " + movieCategoryName);
        for (IMovieSystem movieSystem: movieSystemList) {
            movieSystem.ls();
        }
    }
}
