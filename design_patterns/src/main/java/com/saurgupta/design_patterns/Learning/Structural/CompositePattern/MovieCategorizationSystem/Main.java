package com.saurgupta.design_patterns.Learning.Structural.CompositePattern.MovieCategorizationSystem;

public class Main {
    public static void main(String[] args) {
        MovieCategory allMovies = new MovieCategory("All movies");
        MovieCategory comedyMovies1 = new MovieCategory("Comedy Movies 1");
        MovieCategory comedyMovies2 = new MovieCategory("Comedy Movies 2");
        MovieCategory romanticMovies = new MovieCategory("Romantic Movies");
        MovieCategory bollywoodMovies = new MovieCategory("Bollywood Movies");
        MovieCategory hollywoodMovies = new MovieCategory("Hollywood Movies");

        Movie shawShankRedemption = new Movie("Shawshank Redemption");
        Movie heraPheri = new Movie("Hera Pheri");
        Movie zindagiNaMilegiDobara = new Movie("Zindagi Na Milegi Dobara");
        Movie theHangover = new Movie("The Hangover");
        Movie harryPotter = new Movie("Harry Potter");
        Movie rehnaHaiTereDilMein = new Movie("Rehna Hai Tere Dil Mein");
        Movie missionImpossible = new Movie("Mission Impossible");
        Movie aparichit = new Movie("Aparichit");

        allMovies.add(hollywoodMovies);
        allMovies.add(bollywoodMovies);
        hollywoodMovies.add(comedyMovies1);
        bollywoodMovies.add(comedyMovies2);
        allMovies.add(aparichit);
        hollywoodMovies.add(harryPotter);
        hollywoodMovies.add(shawShankRedemption);
        bollywoodMovies.add(zindagiNaMilegiDobara);
        bollywoodMovies.add(romanticMovies);
        comedyMovies1.add(theHangover);
        comedyMovies2.add(heraPheri);
        hollywoodMovies.add(missionImpossible);
        romanticMovies.add(rehnaHaiTereDilMein);

        allMovies.ls();
    }
}
