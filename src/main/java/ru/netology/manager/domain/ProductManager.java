package ru.netology.manager.domain;

public class ProductManager {


    private MoviePoster[] movies = new MoviePoster[0];
    private int limitMovie = 10;

    public ProductManager() {

    }


    public ProductManager(int limitMovie) {
        this.limitMovie = limitMovie;

    }


    public void addMovie(MoviePoster movie) {
        MoviePoster[] tmp = new MoviePoster[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;

    }

    public MoviePoster[] findAll() {
        return movies;
    }

    public MoviePoster[] findLast() {
        int resultLength;
        if (limitMovie > movies.length) {
            resultLength = movies.length;
        } else {
            resultLength = limitMovie;
        }
        MoviePoster[] result = new MoviePoster[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - i - 1];
        }
        return result;
    }
}


