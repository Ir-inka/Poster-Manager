package ru.netology.manager.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {
    ProductManager manager = new ProductManager();
    MoviePoster movie1 = new MoviePoster(1, 8.3, "The Game", "thriller", 1997);
    MoviePoster movie2 = new MoviePoster(2, 7.5, "28 Days Later...", "horror", 2002);
    MoviePoster movie3 = new MoviePoster(3, 7.1, "American Psycho", "thriller", 2000);
    MoviePoster movie4 = new MoviePoster(4, 8.5, "The Prestige", "thriller", 2006);
    MoviePoster movie5 = new MoviePoster(5, 6.9, "Red Lights", "fantasy", 2011);
    MoviePoster movie6 = new MoviePoster(6, 7.7, "1408", "horror", 2007);
    MoviePoster movie7 = new MoviePoster(7, 7.8, "Saw", "horror", 2004);
    MoviePoster movie8 = new MoviePoster(8, 7, "John Wick", "action movie", 2014);
    MoviePoster movie9 = new MoviePoster(9, 8.3, "The Silence of the Lambs", "thriller", 1990);
    MoviePoster movie10 = new MoviePoster(10, 7.8, "Prisoners", "detective", 2013);
    MoviePoster movie11 = new MoviePoster(11, 7.6, "Wind River", "detective", 2016);
    MoviePoster movie12 = new MoviePoster(12, 7.8, "Jurassic Park", "adventures", 1993);
    MoviePoster movie13 = new MoviePoster(13, 9.1, "The Green Mile", "drama", 1999);
    MoviePoster movie14 = new MoviePoster(14, 7.7, "Now You See Me", "crime", 2013);
    MoviePoster movie15 = new MoviePoster(15, 8.1, "Ocean's Eleven", "crime", 2001);


   /* @BeforeEach
    public void setUp() {
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);
        manager.addMovie(movie11);
        manager.addMovie(movie12);
        manager.addMovie(movie13);
        manager.addMovie(movie14);
        manager.addMovie(movie15);
    }*/

    @Test
    public void moreLimit() {                 // ?? ?????????????????? 12 ??????????????, ?????????????? ?????????? ???? 10(???? ??????????????????) ?????????????????? ?????????????? ?? ???????????????? ??????????????.

        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);
        manager.addMovie(movie11);
        manager.addMovie(movie12);

        MoviePoster[] expected = {movie12, movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3};
        MoviePoster[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void moviesUnderTheLimit() {        // ?? ?????????????????? 6 ??????????????, ?????? ???????????? ???????????? ???? ??????????????????(10), ?????????????? 6 ?? ???????????????? ??????????????.


        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);


        MoviePoster[] expected = {movie6, movie5, movie4, movie3, movie2, movie1};
        MoviePoster[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void theWholeList15() {
        ProductManager manager = new ProductManager(15);    // ???????? ???????????? ?????????????? (15 ????????) ?? ???????????????? ??????????????

        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);
        manager.addMovie(movie11);
        manager.addMovie(movie12);
        manager.addMovie(movie13);
        manager.addMovie(movie14);
        manager.addMovie(movie15);

        MoviePoster[] expected = {movie15, movie14, movie13, movie12, movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        MoviePoster[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLast() {   // ?????????????????? 10 ?????????????? ?? ???????????????? ?????????????? (???? ?????????????????? ?????????? 10 ??????????????)

        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);
        manager.addMovie(movie11);
        manager.addMovie(movie12);
        manager.addMovie(movie13);
        manager.addMovie(movie14);
        manager.addMovie(movie15);

        MoviePoster[] expected = {movie15, movie14, movie13, movie12, movie11, movie10, movie9, movie8, movie7, movie6};
        MoviePoster[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void emptyList() {                              // ???????????? ????????????

        MoviePoster[] expected = {};
        MoviePoster[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showAll10Films() {                                //  ?????????????????? ???????????? 10 ?????????????? ???? ????????????

        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);
        MoviePoster[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
        MoviePoster[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addAndOutputMovies() {  // ?????????????? 5 ?????????????? ?? ?????????????? ???????????? ???? ??????

        manager.addMovie(movie11);
        manager.addMovie(movie12);
        manager.addMovie(movie13);
        manager.addMovie(movie14);
        manager.addMovie(movie15);
        MoviePoster[] expected = {movie11, movie12, movie13, movie14, movie15};
        MoviePoster[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void theWholeList() {    // ???????? ???????????? ?????????????? (15 ????????) ?? ?????????????????????????????? ??????????????

        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);
        manager.addMovie(movie11);
        manager.addMovie(movie12);
        manager.addMovie(movie13);
        manager.addMovie(movie14);
        manager.addMovie(movie15);

        MoviePoster[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10, movie11, movie12, movie13, movie14, movie15};
        MoviePoster[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void displayTheLast10Movies() {                                //  ?????????????????? 10 ?????????????? ?? ?????????????????????????????? ??????????????

        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);
        manager.addMovie(movie11);
        manager.addMovie(movie12);
        manager.addMovie(movie13);
        manager.addMovie(movie14);
        manager.addMovie(movie15);
        MoviePoster[] expected = {movie6, movie7, movie8, movie9, movie10, movie11, movie12, movie13, movie14, movie15};
        MoviePoster[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void displayTheLast2Films() {                               // ?????????????????? 2 ???????????? ?? ?????????????????????????????? ??????????????

        manager.addMovie(movie14);
        manager.addMovie(movie15);
        MoviePoster[] expected = {movie14, movie15};
        MoviePoster[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void shouldFindLast12() {                                         // ?????????????????? 12 ?????????????? ?? ???????????????? ??????????????
        ProductManager manager = new ProductManager(12);

        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);
        manager.addMovie(movie11);
        manager.addMovie(movie12);
        manager.addMovie(movie13);
        manager.addMovie(movie14);
        manager.addMovie(movie15);
        MoviePoster[] expected = {movie15, movie14, movie13, movie12, movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4};
        MoviePoster[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void find5LatestMovies() {                       // ?????????????????? 5 ?????????????? ?? ???????????????? ??????????????

        manager.addMovie(movie11);
        manager.addMovie(movie12);
        manager.addMovie(movie13);
        manager.addMovie(movie14);
        manager.addMovie(movie15);
        MoviePoster[] expected = {movie15, movie14, movie13, movie12, movie11};
        MoviePoster[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLatestMovies() {                                  // ?????????????????? 2 ???????????? ?? ???????????????? ??????????????

        manager.addMovie(movie14);
        manager.addMovie(movie15);
        MoviePoster[] expected = {movie15, movie14};
        MoviePoster[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }


}




