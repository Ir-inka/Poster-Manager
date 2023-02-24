package ru.netology.manager.domain;

public class MoviePoster {
    private int id; // id фильма
    private double rentalRating; // рейтинг проката
    private String movieTitle; // название фильма
    private String filmGenre; // жанр фильма
    private int yearOfIssue; // год выпуска


    public MoviePoster(int id, double rentalRating, String movieTitle, String filmGenre, int yearOfIssue) {
        this.id = id;
        this.rentalRating = rentalRating;
        this.movieTitle = movieTitle;
        this.filmGenre = filmGenre;
        this.yearOfIssue = yearOfIssue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRentalRating() {
        return rentalRating;
    }

    public void setRentalRating(double rentalRating) {
        this.rentalRating = rentalRating;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
}





