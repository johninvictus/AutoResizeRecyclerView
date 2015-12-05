package com.threading.invictus.autoresizerecyclerview.objects;

/**
 * Created by invictus on 12/1/2015.
 */
public class Movie {
    private String movieName;
    private int movieImage;

    public Movie(String movieName, int movieImage) {
        this.movieName = movieName;
        this.movieImage = movieImage;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(int movieImage) {
        this.movieImage = movieImage;
    }
}
